package br.com.alura.screenmatch.service;
import com.deepl.api.*;

public class Traducao {
    static Translator translator;

        public static String obterTraducao(String texto)  {
            String authKey = "77e54aff-e7c9-4fac-a421-0942cef60785:fx";
            translator = new Translator(authKey);
            TextResult result =
                    null;
            try {
                result = translator.translateText(texto, null, "pt-BR");
                System.out.println(result.getText());
                return result.getText();
            } catch (DeepLException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }






}
