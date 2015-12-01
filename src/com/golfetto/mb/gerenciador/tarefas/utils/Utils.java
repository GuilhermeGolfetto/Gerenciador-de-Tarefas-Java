package com.golfetto.mb.gerenciador.tarefas.utils;

import com.golfetto.mb.gerenciador.tarefas.classes.Tarefa;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Utils {

    public static void criarXML(){
        File arquivo = new File("tarefa.xml");
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao criar arquivo:" + ex);
            }
        }
    }
    
    public static void gravar(String xml) {
        FileWriter w = null;
        try {
            //O segundo argumento indica que ele vai continuar escrevendo ao fim do arquivo
            w = new FileWriter("tarefa.xml", true);
            w.write(xml);
            w.close();
        } catch (Exception e) {
            System.out.println("Erro ao gravar XML: " + e);
        }
    }

    public static String ler() {
        Scanner in;
        try {
            in = new Scanner(new File("tarefa.xml"));
            StringBuilder sb = new StringBuilder();
            while (in.hasNext()) {
                sb.append(in.next());
            }
            in.close();
            return sb.toString();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler XML: " + e);
        }
        return "";
    }

}
