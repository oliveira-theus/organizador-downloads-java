# Organizador de Downloads (Java)

Programa em Java que organiza a pasta Downloads, separando os arquivos em pastas por categoria de acordo com a extensão.

## Como funciona

| Extensão | Pasta |
|---|---|
| .pdf, .xml | Documentos |
| .png, .jpg, .jpeg, .heic | Imagens |
| .zip, .rar | Compactados |
| .exe, .dmg | Instaladores |
| outras | Outros |

- Ignora subpastas e arquivos ocultos (que começam com `.`)
- Não sobrescreve: se já existir um arquivo com o mesmo nome no destino, ele é pulado
- Mostra no terminal cada arquivo movido (`arquivo -> categoria`)

## Como rodar

Requisito: Java instalado (JDK).

```bash
javac Organizador.java
java Organizador
```

⚠️ O programa move arquivos de verdade. Feche downloads em andamento antes de rodar.

## O que aprendi

- Manipulação de arquivos com `java.io.File`
- Uso de `HashMap` (extensão → categoria)
- Tratamento de arquivos sem extensão

## Próximos passos

- [ ] Renomear duplicados (`arquivo (1).pdf`) em vez de pular
- [ ] Verificar se o `renameTo` funcionou
- [ ] Monitorar a pasta em tempo real com `WatchService`
- [ ] Permitir escolher a pasta por argumento

## Autor

Matheus Ferreira Oliveira
