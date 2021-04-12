Żeby uruchomić projekt:
1. Użyj opcji *„Import project from existing sources”* z IntelliJ IDEA (wystarczy Community)
1. Wybierz podczas importu opcję *Gradle* i przeklikaj do końca **wybierając Javę w wersji 11**, a poza tym używając domyślnych opcji
1. Upewnij się, że masz w swoim IntelliJ IDEA wsparcie dla Groovy’ego - jeśli nie, zainstaluj plugin wd. instrukcji tutaj: https://www.jetbrains.com/help/idea/groovy.html#d272979e9
1. Upewnij się, że opcja *"Annotation processing"* jest włączona. Jest ona wymagana przez plugin Lombok. Żeby to sprawdzić wyszukaj akcję (Ctrl - Shift - A) *"Enable annotation processing"*
1. W prawidłowo zaimportowanym projekcie powinno być możliwe: 
    - Uruchomienie z sukcesem *build* z gradle 
    - Uruchomienie pojedynczego testu z poziomu IDE.
