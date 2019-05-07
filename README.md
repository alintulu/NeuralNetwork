# Neural Network

This repository contains a neural network built in Java for the course of OhjelmistoTekniikan Menetelmä 
(OTM) at the University of Helsinki. The network works on poly-dimensional input data however it comes with a 
ready built method to train and validate it on one-dimensional inpu data of a cosine curve.

The network uses the activation function of the sigmoid curve and the optimizer of gradient descent.
It performs well on one-dimensional input data however the performance declines quickly as the dimensions increase.
The current performance can be seen [here](https://github.com/alintulu/NeuralNetwork/blob/master/src/README.md).

The source code 
is located in the folder [src](https://github.com/alintulu/NeuralNetwork/tree/master/src). Instructions how
to employ the network and basic knowledge of the network and output is located in the folder 
[documentation](https://github.com/alintulu/NeuralNetwork/tree/master/documentation).

## Documentation

  1. [Instructions](https://github.com/alintulu/NeuralNetwork/blob/master/documentation/Instructions.md)
  2. [Basic knowledge of a neural network](https://github.com/alintulu/NeuralNetwork/blob/master/documentation/UnderstandingTheNetwork.md)
  2. [Understanding the output of the network](https://github.com/alintulu/NeuralNetwork/blob/master/documentation/UnderstandingTheOutput.md)
  
## Testing

The test code is located in the folder [test](https://github.com/alintulu/NeuralNetwork/tree/master/test/neuralnetwork).
For testing the program, the following command can be performed in the root directory

```
mvn test
```

In addition, the test coverage report can be created with the command

```
mvn test jacoco: report
```

## Checkstyle

The Checkstyle Plugin generates a report regarding the code style used. It performs an analysis and 
generates if necessary a report on violation. The checks specified by the `checkstyle.xml` file are executed with the command

```
mvn jxr: jxr checkstyle: checkstyle 
```

And error messages are saved in the `target/site/checkstyle.html` file.

## Javadoc

It is possible to generate the Javadoc files for the project with the command

```
mvn javadoc:javadoc
```

It executes the standard Javadoc tool and supports the parameters used by the tool.
