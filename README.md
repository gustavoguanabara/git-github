# 🚀 Guia Prático de Git, GitHub e Markdown

<div align="center">

![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)
![Markdown](https://img.shields.io/badge/Markdown-000000?style=for-the-badge&logo=markdown&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20Estudo-brightgreen?style=for-the-badge)

<p align="center">
  <b>Manual simples e direto para quem está dando os primeiros passos com controle de versão e documentação no GitHub.</b><br>
  <i>Baseado nas aulas do Professor Gustavo Guanabara (<a href="https://www.cursoemvideo.com/">Curso em Vídeo</a>).</i>
</p>

</div>

---

## 📌 O que você vai encontrar aqui

- [1. O que são Git e GitHub?](#-1-o-que-são-git-e-github)
- [2. Como funciona o dia a dia no GitHub](#-2-como-funciona-o-dia-a-dia-no-github)
- [3. Comandos básicos do Git](#-3-comandos-básicos-do-git)
- [4. Guia Fácil de Markdown (Como deixar o texto bonito)](#-4-guia-fácil-de-markdown-como-deixar-o-texto-bonito)
- [5. O que é Fork e Pull Request?](#-5-o-que-é-fork-e-pull-request)
- [6. Créditos e Materiais Originais](#-6-créditos-e-materiais-originais)

---

## 💡 1. O que são Git e GitHub?

Muita gente confunde os dois no começo, mas a diferença é bem simples:

| Ferramenta | O que é na prática | Onde funciona |
| :--- | :--- | :--- |
| **Git** | É o programa que guarda o histórico de todas as alterações feitas nos seus arquivos (como uma "máquina do tempo" do código). | **No seu computador** (funciona até sem internet). |
| **GitHub** | É a rede social e plataforma na nuvem onde você guarda seus projetos e compartilha com outras pessoas. | **Na internet** (acessado pelo navegador ou pelo GitHub Desktop). |

---

## 🔄 2. Como funciona o dia a dia no GitHub

Quando você cria ou edita um projeto, o arquivo passa por **3 etapas simples**:

1. **Modificar:** Você edita o arquivo no seu computador (usando o Visual Studio Code, por exemplo).
2. **Registrar (Commit):** Você salva uma "foto" daquela alteração com uma mensagem explicando o que mudou (ex: *"Adicionei a introdução no README"*).
3. **Enviar (Push):** Você empurra essa alteração do seu computador para a sua conta no GitHub na nuvem.

> **Dica:** Se você editar um arquivo direto no site do GitHub, precisa fazer o caminho inverso no seu computador: clicar em **Buscar (Fetch)** e **Puxar (Pull)** no GitHub Desktop para trazer a novidade para a sua pasta local.

---

## 🛠️ 3. Comandos básicos do Git

Mesmo usando programas visuais como o **GitHub Desktop**, vale conhecer os comandos principais usados no terminal:

| Comando | Para que serve |
| :--- | :--- |
| `git clone <link>` | Baixa uma cópia completa de um repositório do GitHub para o seu computador. |
| `git status` | Mostra quais arquivos foram criados ou alterados na sua pasta. |
| `git add .` | Prepara todos os arquivos alterados para serem salvos. |
| `git commit -m "mensagem"` | Grava as alterações no histórico com uma frase explicativa. |
| `git push` | Envia os registros salvos no computador para o seu GitHub na nuvem. |
| `git pull` | Baixa as atualizações que estão na nuvem para a sua pasta no computador. |

---

## 📝 4. Guia Fácil de Markdown (Como deixar o texto bonito)

O **Markdown** é uma linguagem simples que usa símbolos do teclado (como `#`, `*` e `-`) para formatar textos no arquivo `README.md` sem precisar usar código HTML complicado.

### Títulos e Linhas Divisórias
Use o símbolo `#` antes do texto. Quanto mais `#`, menor fica o título (vai de 1 até 6):

```markdown
# Título Principal (Nível 1)
## Subtítulo (Nível 2)
### Título Menor (Nível 3)
```

Para criar uma linha horizontal separando assuntos, use três traços (`---`) ou três asteriscos (`***`).

---

### Formatação de Texto (Negrito, Itálico e Riscado)
Lembre-se de **não deixar espaço** entre os símbolos e a palavra:

| Como você escreve | Como aparece na tela |
| :--- | :--- |
| `**Texto em negrito**` ou `__negrito__` | **Texto em negrito** ou __negrito__ |
| `*Texto em itálico*` ou `_itálico_` | *Texto em itálico* ou _itálico_ |
| `~~Texto riscado~~` | ~~Texto riscado~~ |
| `__*Negrito e itálico juntos*__` | __*Negrito e itálico juntos*__ |

---

### Listas e Caixinhas de Tarefas

**Lista numerada** (basta colocar números seguidos de ponto; o GitHub organiza a ordem sozinho):
```markdown
1. Primeiro passo
2. Segundo passo
3. Terceiro passo
```

**Lista com marcadores** (use `*` ou `-` seguido de um espaço):
```markdown
- Item da lista
- Outro item
  - Subitem (dê 2 ou 3 espaços antes do traço)
```

**Lista de tarefas** (use `- [ ]` para pendente e `- [x]` para concluída):
- [x] Criar conta no GitHub
- [x] Clonar o repositório para o computador
- [ ] Dominar todas as marcações em Markdown

---

### Links e Imagens

A estrutura é parecida; a única diferença é que a imagem começa com um ponto de exclamação (`!`):

* **Para criar um link:** `[Texto que aparece](https://link-do-site.com)`
  * Exemplo na prática: [Visitar meu perfil no GitHub](https://github.com/Tonjr12)
* **Para mostrar uma imagem:** `![Descrição da imagem](https://link-da-imagem.com/foto.png)`

---

### Trechos de Código

* **Comando curto no meio da frase:** coloque entre crases simples (`` ` ``).
  * Exemplo: Use o comando `git status` para ver o estado da pasta.
* **Bloco de código com várias linhas:** coloque três crases (`` ``` ``) antes e depois do código:

```python
nome = "Tonjr12"
print(f"Olá, {nome}! Bem-vindo ao GitHub.")
```

---

### Citações, Emojis e Símbolos

* **Citação:** use o sinal `>` no início da linha:
  > "Decidir o que não fazer é tão importante quanto decidir o que fazer." — Steve Jobs

* **Emojis:** coloque o nome do emoji entre dois-pontos (`:`):
  * `:rocket:` fica :rocket:
  * `:white_check_mark:` fica :white_check_mark:
  * `:clap:` fica :clap:

* **Mostrar o símbolo sem formatar:** coloque uma barra invertida (`\`) antes do símbolo. Por exemplo, escrever `\# Título` mostra o `#` na tela em vez de transformar em título.

---

### Tabelas Simples

Use barras em pé (`|`) para separar as colunas e traços (`---`) na segunda linha para separar o cabeçalho:

```markdown
| Aula | Assunto | Situação |
| :--- | :---: | ---: |
| 01 | Git e GitHub | Concluída |
| 02 | Linguagem Markdown | Concluída |
```

**Resultado na tela:**

| Aula | Assunto | Situação |
| :--- | :---: | ---: |
| 01 | Git e GitHub | Concluída |
| 02 | Linguagem Markdown | Concluída |

*(Dica: os dois-pontos `:` na segunda linha definem o alinhamento: `:---` à esquerda, `:---:` centralizado e `---:` à direita).*

---

## 🤝 5. O que é Fork e Pull Request?

* **Fork (Garfo):** É quando você pega o repositório público de outra pessoa e cria uma **cópia independente dentro da sua conta**. Você pode alterar tudo nessa cópia sem afetar o projeto original.
* **Pull Request (Solicitação de Pull):** É quando você faz uma melhoria na sua cópia e envia um pedido para o dono do repositório original aceitar e juntar a sua ideia no projeto dele.

---

## 👨‍🏫 6. Créditos e Materiais Originais

Todo o aprendizado deste guia foi baseado nos conteúdos gratuitos disponibilizados pelo **Professor Gustavo Guanabara**:

- **Playlist Oficial no YouTube:** [Curso de Git e GitHub - Curso em Vídeo](https://www.youtube.com/playlist?list=PLHz_AreHm4dm7ZULPAmadvNhH6vk9oNZA)
- **Repositório Original do Curso:** [gustavoguanabara/git-github](https://github.com/gustavoguanabara/git-github)
- **Plataforma de Cursos:** [Curso em Vídeo](https://www.cursoemvideo.com/)

---

<div align="center">
  Organizado e adaptado por <b>Tonjr12</b> 🚀
</div>
