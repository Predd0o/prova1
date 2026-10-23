# Estudo de Busca Binária (Java)

Projeto de treino com 9 questões. Cada `*Impl.java` contém o enunciado e as
restrições no Javadoc; os testes descrevem os casos esperados.

| # | Classe | Pacote |
|---|--------|--------|
| 1 | CountLessThanImpl | problems |
| 2 | FirstOccurrenceBinarySearchImpl | binarysearch |
| 3 | LastOccurrenceBinarySearchImpl | binarysearch |
| 4 | IntegerSquareRootBinarySearchImpl | binarysearch |
| 5 | IntegerCubeRootBinarySearchImpl | binarysearch |
| 6 | MinInRotatedArrayImpl | binarysearch |
| 7 | PeakIndexImpl | binarysearch |
| 8 | CeilImpl | problems |
| 9 | ClosestImpl | problems |

## Como rodar no VS Code
1. Instale a extensão **Extension Pack for Java**.
2. Abra a pasta `estudo-busca-binaria` (File > Open Folder).
3. Coloque o JAR do JUnit 5 em `lib/` (veja `lib/LEIA-ME.txt`) ou use "Enable Java Tests".
4. Abra o painel **Testing** e rode os testes de cada questão.

## Via terminal (opcional)
```
javac -cp "lib/*" -d bin $(find src -name "*.java")
java -jar lib/junit-platform-console-standalone-1.10.2.jar -cp bin --scan-classpath
```

## Molde recursivo
Sempre: um `resultado`, caso base `low > high`, `mid = low + (high - low) / 2`,
descartar metade, um único `return`.
