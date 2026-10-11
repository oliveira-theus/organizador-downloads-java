import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Organizador {
    public static void main(String[] args) {
        String home = System.getProperty("user.home");
        File pasta = new File(home, "Downloads");

        Map<String, String> categorias = new HashMap<>();
        categorias.put(".pdf", "Documentos");
        categorias.put(".xml", "Documentos");
        categorias.put(".png", "Imagens");
        categorias.put(".jpg", "Imagens");
        categorias.put(".jpeg", "Imagens");
        categorias.put(".heic", "Imagens");
        categorias.put(".zip", "Compactados");
        categorias.put(".rar", "Compactados");
        categorias.put(".exe", "Instaladores");
        categorias.put(".dmg", "Instaladores");

        String[] arquivos = pasta.list();

        for (String nome : arquivos) {
            File origem = new File(pasta, nome);

            if (!origem.isFile() || nome.startsWith(".")) {
                continue; // ignora pastas e arquivos ocultos
            }

            int ponto = nome.lastIndexOf('.');
            String extensao = "";
            if (ponto != -1) {
                extensao = nome.substring(ponto).toLowerCase();
            }

            String categoria = categorias.getOrDefault(extensao, "Outros");

            File destinoPasta = new File(pasta, categoria);
            destinoPasta.mkdirs();

            File destino = new File(destinoPasta, nome);
            if (destino.exists()) {
                System.out.println("Pulado (já existe): " + nome);
                continue;
            }

            origem.renameTo(destino);
            System.out.println(nome + " -> " + categoria);
        }

        System.out.println("Arquivos organizados com sucesso!");
    }
}
