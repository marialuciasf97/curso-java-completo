# Aula 016 - Instalando o Java JDK

## 16.1 Introdução
Nesta aula, veremos como instalar o **Java JDK** no Linux (SO utilizado por mim) e configurar corretamente a variável de ambiente `JAVA_HOME`.  
Eu utilizei o **OpenJDK 21**, que é a versão LTS mais atual no momento que estou fazendo este curso.

---

## 16.2 Instalação no Linux

### Passo 1 — Instalar o JDK
Abra o terminal e execute o comando:
```bash
sudo apt-get install openjdk-21-jdk
```

---

### Passo 2 — Verificar instalação
Após a instalação, verifique se o Java foi instalado corretamente com:
```bash
java -version
```

---

## 16.3 Configurar variável de ambiente JAVA_HOME

### Passo 1 — Verificar caminho de instalação
Execute:
```bash
sudo update-alternatives --config java
```
Copie o caminho desejado.

---

### Passo 2 — Editar o arquivo `.bashrc`
Abra o arquivo para edição:
```bash
sudo gedit ~/.bashrc
```
Caso não tenha o **gedit** instalado ou queira usar o **nano**:
```bash
sudo nano ~/.bashrc
```

---

### Passo 3 — Adicionar as variáveis
No final do arquivo, adicione as seguintes linhas:
```bash
JAVA_HOME=[caminho_do_seu_java_sem_/bin/java/]
export JAVA_HOME
export PATH=$PATH:$JAVA_HOME
```

> Eu fiz de forma mais direta, assim:
```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
```

---

### Passo 4 — Salvar alterações
- No **nano**: pressione `Ctrl + O` para salvar e `Ctrl + X` para sair.  
- No **gedit**: basta salvar e fechar a janela.

---

## 16.4 Verificar variável de ambiente

Para confirmar se a variável foi salva:
```bash
cat ~/.bashrc
```

Feche o terminal, abra um novo e execute:
```bash
echo $JAVA_HOME
```

Se o caminho aparecer corretamente, a configuração foi concluída.

---

## 16.5 Links úteis para instalação em outros sistemas

- **Windows:** [Instalação do JDK no Windows](https://www.youtube.com/watch?v=QekeJBShCy4)  
- **Linux:** [Instalação do JDK no Linux](https://www.youtube.com/watch?v=Sv0EwYPLw8w&list=PLNuUvBZGBA8mcAF-YX7RJhA26TBLdG5yk&index=3)  
- **Mac:** [Guia para Mac](https://github.com/devsuperior/sds2/tree/master/instalacao/mac#java-11-on-macos)
