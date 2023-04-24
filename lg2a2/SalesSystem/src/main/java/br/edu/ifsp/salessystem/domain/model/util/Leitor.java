//package br.edu.ifsp.salessystem.domain.model.util;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.util.ArrayList;
// TODO: APAGAR CLASSE
//public class Leitor {
//    private String caminhoArquivo;
//    private int indiceCampoChave;
//    private String valorCampoChave;
//
//    public Leitor(String caminhoArquivo, int indiceCampoChave, String valorCampoChave) {
//        this.caminhoArquivo = caminhoArquivo;
//        this.indiceCampoChave = indiceCampoChave;
//        this.valorCampoChave = valorCampoChave;
//    }
//
//
//    public ArrayList<String> conteudo() throws Exception {
//
//        File file = new File(this.caminhoArquivo);
//
//        BufferedReader br = new BufferedReader(new FileReader(file));
//
//        String st;
//        int contadorLinha = 0;
//        ArrayList<String> linhas = new ArrayList<String>();
//        while ((st = br.readLine()) != null) {
//            contadorLinha = contadorLinha + 1;
//            if (contadorLinha == 1) {
//                continue;
//            }
//            String[] campos = st.split(";");
//            if (campos[indiceCampoChave].equals(valorCampoChave)){
//                linhas.add(st);
//            }
//        }
//        br.close();
//        return linhas;
//    }
//
//    public static void main(String[] args) throws Exception {
//        Leitor leitor = new Leitor("./src/Pedido.txt",0,"2");
//        leitor.conteudo();
//    }
//}
