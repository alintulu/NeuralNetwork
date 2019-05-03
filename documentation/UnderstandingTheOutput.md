# Understanding the Output

The network will return two sets of outputs. One for training and one for validation. 
Further these two sets will contain two different metrics used to evaluate the network, `loss` and `accuracy`.
Training a model simply means finding good values for all the weights and the bias from labeled examples.

# Loss

In supervised learning, a machine learning algorithm builds a model by examining many examples and attempting
to find a model that minimizes the loss. This process is called empirical risk minimization.

Loss is the penalty for a bad prediction. The lower the loss, the better a model (unless the model has over-fitted 
to the training data). The loss is calculated on training and validation and its interperation is how well the model is doing for 
these two sets. Unlike accuracy loss is not a percentage, it is a cumulative sum of the errors made for each 
example in training or validation sets. 

The goal of training a model is to find a set of weights and biases that have low loss, on average, across all examples. 
