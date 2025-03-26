package src.strings.challenges;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Eduardo J
 * JDK 22.0.1 (Zulu) with preview features enabled.
 */

final class Integration {

    void main() {
        final String[] videos = {
                "4668c219-296d-40de-a073-99b85026e977,01-01 Visão geral do capítulo.mp4,222",
                "81be4133-f81a-443a-96f3-0c30d7460ab8,01-02 Algoritmos e Lógica de Programação.mp4,396",
                "b82f4f7b-f8f1-43e2-974d-3821e6a59e45,01-03 Estruturas de dados é sobre o quê.mp4,567",
                "ccde5219-f2df-4a11-b981-e0cdfa3c6224,01-04 Precisa saber OO antes de ED.mp4,215",
                "e77cf174-9547-4d7f-8372-ef23f193938f,01-05 Esse curso também é para outras linguagens.mp4,219",
                "254ef676-7bc5-478d-8250-0ce2616c9731,01-06 Vamos falar sobre objetos e funções.mp4,94",
                "e030627b-a8e0-4bde-bda8-edc78503fc2c,02-01 Visão geral do capítulo.mp4,389",
                "c4be1d39-6c97-4721-afd5-3b63ca0abf0a,02-02 Aviso sobre os exercícios.mp4,107",
                "6364ff0f-bc34-4166-8b35-2f0d9cf1b062,02-03 Literais e expressões em Javascript PARTE 1.mp4,545",
                "e7245f74-0135-4af0-9b79-bf4927438cfc,02-04 Literais e expressões em Javascript PARTE 2.mp4,567",
                "a7fc8b41-ce2f-4751-a6a7-39d4db32fbe0,02-05 Imutabilidade de strings em Javascript.mp4,310",
                "a8071e3d-97fe-4cc8-b377-2a69f50844a6,02-06 Funções de string em Javascript PARTE 1.mp4,748",
                "b8624056-07ad-4caa-8deb-1db75e04a8f6,02-07 Funções de string em Javascript PARTE 2.mp4,797",
                "215a5a6a-4171-4f98-b803-4d02811da5ae,02-08 Funções de string em Javascript PARTE 3.mp4,374",
                "32029cca-af8a-4b20-971a-08ccf350d2f4,02-09 Expressões regulares.mp4,486"
        };

        System.out.println(csvToJson(videos));
    }

    public String csvToJson(String[] videos) {
        final var sb = new StringBuilder();
        sb.append("[\n");

        for (var i = 0; i < videos.length; i++) {
            final var video = new Video(videos[i]);
            final var text = i == (videos.length - 1) ? video.toString().replace("},", "}") : video;
            sb.append(text);
        }

        sb.append("]");
        return sb.toString();
    }

    record Video(String id, String title, Long duration) {

        private static final Integer EXTENSION_LENGTH = 4;
        private static final Integer NUMERATION_POSITION = 1;

        public Video(final String video) {
            final var split = video.split(",");
            final var id = split[0];
            final var title = Arrays
                    .stream(
                            split[1]
                                    .substring(0, split[1].length() - EXTENSION_LENGTH)
                                    .split(" ")
                    )
                    .skip(NUMERATION_POSITION)
                    .collect(Collectors.joining(" "));

            final var duration = Long.parseLong(split[2]);

            this(id, title, duration);
        }

        @Override
        public String toString() {
            return STR."""
               \t{
                    \t"id": "\{id}",
                    \t"title": "\{title}",
                    \t"duration": \{duration}
                \t},
               """;
        }
    }
}
