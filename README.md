# Passos de instalação e utilização do git

0. Instalar o git no seu computador do site https://git-scm.com/

1. Entar no diretório a ser versionado:

```
$ cd /dojo/fizzbuzz
```

2. Verificar no diretório se ele é um repositório do git.
```
$ git status
fatal: Not a git repository (or any of the parent directories): .git

```

3. Antes de inicializar o repositório você precisa configurar o seu usuário (nome e email) no git
```
$ git config --global user.name "seu nome aqui"

$ git config --global user.email "seu@email.aqui"
```

4. Inicializar o diretório como um repositório do git
```
$ git init
Initialized empty Git repository in /dojo/fizzbuzz/.git/
```

5. Verificar o status novamente
```
$ git status
On branch master

Initial commit

Untracked files:
  (use "git add <file>..." to include in what will be committed)
...
```

6. Incluir todos os arquivos para serem acompanhados pelo versionamento do git
```
$ git add --all
```

7. Verificar o status novamente
```
$ git status
On branch master

Initial commit

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
....
```

7. Comitar (gravar) uma versão dos arquivos
```
$ git commit -m "Commit inicial em 09/06/18 aula sábado com 4 alunos (Ricardo, Janison, Nicolas, Daniel)"
```

8. Adicionar o caminho para um repositório remoto (por exemplo no github)
```
$ git remote add origin https://github.com/taleswsouza/fizzbuzz.git
```

9. Enviar os arquivos para o repositório remoto que foi adicionado
```
$ git push -u origin master
```

_____________
Abraços
T.
