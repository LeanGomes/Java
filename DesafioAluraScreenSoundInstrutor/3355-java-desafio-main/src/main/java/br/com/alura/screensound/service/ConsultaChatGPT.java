package br.com.alura.screensound.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {

    // Método estático que recebe um texto (nome do artista) e retorna uma string com informações sobre ele.
    public static String obterInformacao(String texto) {
        // Cria uma instância de OpenAiService utilizando a chave da API armazenada nas variáveis de ambiente.
        OpenAiService service = new OpenAiService(System.getenv("OPENAI_APIKEY"));

        // Configura a solicitação de conclusão para a API OpenAI com o modelo "text-davinci-003".
        CompletionRequest requisicao = CompletionRequest.builder()
                .model("text-davinci-003") // Define o modelo de linguagem a ser utilizado.
                .prompt("me fale sobre o artista: " + texto) // Prompt para a API, pedindo informações sobre o artista.
                .maxTokens(1000) // Limita a quantidade máxima de tokens (palavras + pontuação) da resposta.
                .temperature(0.7) // Define o nível de criatividade da resposta (0 = mais conservadora, 1 = mais criativa).
                .build();

        // Envia a requisição para a API da OpenAI e obtém a resposta.
        var resposta = service.createCompletion(requisicao);

        // Retorna o texto da primeira opção de resposta da API.
        return resposta.getChoices().get(0).getText();
    }
}

