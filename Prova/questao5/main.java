public class Main {
    public class Elevador {

        private int cap;
        private int andarAtual;
        private int totalAndares;
        private int pessoasPresentes;
       
    
        public Elevador(int totalAndares, int cap) {
            this.totalAndares = totalAndares;
            this.cap = cap;
    
            this.andarAtual = 1;
            this.pessoasPresentes = 0;
        }
    
        public void entra(int qtdPessoas) {
            if (this.pessoasPresentes + qtdPessoas <= this.cap) {
                this.pessoasPresentes += qtdPessoas;
                 System.out.println("Entra "+qtdPessoas+" pessoas");
            }
            System.out.println(this.toString());
        }
    
        public void sai(int qtdPessoas) {
            if (this.pessoasPresentes - qtdPessoas >= 0) {
                this.pessoasPresentes -= qtdPessoas;
                System.out.println("Sai "+qtdPessoas+" pessoas");
            }
             System.out.println(this.toString());
        }
    
        public void sobe(int andar) {

            if (this.andarAtual < andar) {
                for (int c = this.andarAtual; c < andar; c++) {
                    this.andarAtual++;
                    System.out.println("Subindo!" + this.andarAtual);
                }
            }
             System.out.println(this.toString());
        }
    
        public void desce(int andar) {

            if (this.andarAtual > andar) {
               for (int c = this.andarAtual; c > andar; c--) {
                    this.andarAtual--;
                    System.out.println("Descendo!" + this.andarAtual);
                }
            }
             System.out.println(this.toString());
        }
    
        @Override
        public String toString() {
            return "Elevador{" + "andarAtual=" + andarAtual + ", totalAndares=" + totalAndares + ", cap=" + cap + ", pessoasPresentes=" + pessoasPresentes + '}';
        }
    

        public int getAndarAtual() {
            return andarAtual;
        }
        public void setAndarAtual(int andarAtual) {
            this.andarAtual = andarAtual;
        }
    
        public int getTotalAndares() {
            return totalAndares;
        }
        public void setTotalAndares(int totalAndares) {
            this.totalAndares = totalAndares;
        }
    
        public int getCap() {
            return cap;
        }
        public void setCap(int cap) {
            this.capacidade = cap;
        }
    
        public int getPessoasPresentes() {
            return pessoasPresentes;
        }
        public void setPessoasPresentes(int pessoasPresentes) {
            this.pessoasPresentes = pessoasPresentes;
        }
    }
}
