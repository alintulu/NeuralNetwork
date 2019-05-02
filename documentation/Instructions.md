# Instructions

## Building the network

Building the network is done in the file [NeuralNetwork.java](https://github.com/alintulu/NeuralNetwork/blob/master/src/neuralnetwork/NeuralNetwork.java). The method to do so is called `makeNetwork()` and is called from the main function.

The method takes three inputs.

```
  numInputNodes 
    - number of input nodes
  numHiddenLayers 
    - number of hidden layers
  numInEachLayer
    - number of nodes in each layer
```
  
As default the number of input nodes is 1, number of hidden layers 3 and number of nodes in each layer 10. You can change all mentioned values [here](https://github.com/alintulu/NeuralNetwork/blob/master/src/neuralnetwork/NeuralNetwork.java#L104), however keep in mind that the default training data is two-dimensional and requires therefore `numInputNodes` to equal 1. 

## Training the network

Training the network is done in the file [Network.java](https://github.com/alintulu/NeuralNetwork/blob/master/src/neuralnetwork/Network.java). The method to do so is called `trainNetwork()` and is called from the main function.

The method takes three inputs.

```
  traingData
    - List of training data, by default data of a sine curve
  N
    - batch size of the training data
  learningRate
    - Rate of which the network will learn
  numIterations
    - Number of times the network should iterate through the given training data
  printError
    - boolean for printing statistics
```

By default the training data is an array of size 100 containing x and y values of a sine curve. The learning rate is set to 0.01 and number of iterations to 1000. You can change all the mentioned values [here](https://github.com/alintulu/NeuralNetwork/blob/master/src/neuralnetwork/NeuralNetwork.java#L106).

## Testing the network

Testing the network is done in the file [Network.java](https://github.com/alintulu/NeuralNetwork/blob/master/src/neuralnetwork/Network.java). The method to do so is called `testNetwork()` and is called from the main function.

The method takes two inputs.

```
  trainData
    - List of training data, by default data of a sine curve
  N
    - batch size of the training data
```

By default the training data is an array of size 50 containing x and y values of a sine curve. You can change all the mentioned values [here](https://github.com/alintulu/NeuralNetwork/blob/master/src/neuralnetwork/NeuralNetwork.java#L112).