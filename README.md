# Neural Network

Main function to build the neural network and train as well as test it is done in the file [NeuralNetwork.java](neuralnetwork/NeuralNetwork.java).
If you wish to change the number of internal nodes or number of hidden layers, do it [here](https://github.com/alintulu/NeuralNetwork/blob/master/neuralnetwork/NeuralNetwork.java#L104).

## Current performance (23.04.2019)

### Settings

```
makeNetwork(1, 3, 10)
network.trainNetwork(sineTest(100), 100, 0.01, 1000, false)
network.testNetwork(sineTest(50), 50)
```

### Training loss

Each loss is calculated with 100 iterations between values (i.e. first after 100 iterations, second after 200 iterations etc)

```
0.3921109844995156
0.11446661139538987
0.11416035185276044
0.113978954400356
0.11339826346614376
0.10986621496152318
0.09110020821530945
0.08076424698431092
0.07957524807844027
0.07935500987926618
```

### Validation loss

```
0.07112476578231174
```
