package com.example.trabalhoapp;

import android.annotation.SuppressLint;
        import android.content.Context;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

        import androidx.annotation.Nullable;

public class BDCore extends SQLiteOpenHelper {
    public static final String nomeBanco = "GYM";
    public static final int versaoBanco = 2;

    public BDCore(Context context){
        super(context, nomeBanco,null, versaoBanco);

    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("" +
                "create table usuario (_id integer primary key autoincrement, nome text not null, email text not null, senha text not null)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table usuario");
        onCreate(sqLiteDatabase);
    }

    @SuppressLint("Range")
    public boolean validarUsuario(Usuario usuario){
        SQLiteDatabase db = getReadableDatabase();
        String busca_usuario = "SELECT * FROM usuario WHERE email = " + "'" + usuario.getEmail() + "'";
        Cursor cursor = db.rawQuery(busca_usuario, null);

        while(cursor.moveToNext()){
            if(usuario.getEmail().equals(cursor.getString(cursor.getColumnIndex("email")))){
                if(usuario.getSenha().equals(cursor.getString(cursor.getColumnIndex("senha")))){
                    return true;
                }
            }
        }
        db.close();
        cursor.close();
        return false;
    }
}