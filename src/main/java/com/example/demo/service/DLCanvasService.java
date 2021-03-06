package com.example.demo.service;

import com.example.demo.entry.DLCanvas.DLCanvas;
import com.example.demo.entry.DLCanvas.Nodes;
import com.example.demo.entry.DLCanvas.Paths;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class DLCanvasService {

    public static String json2StrModule(String jsonStr) {

        //开发时候测试用
//    public static void main(String[] args) {
//
//        String jsondata = "{\"nodes\":[{\"id\":\"node10\",\"name\":\"InputLayer\",\"icon\":\"task-icon-41\",\"category\":\"02\",\"operator\":\"InputLayer\",\"children\":[],\"nodeParam\":{\"input_shape\":\"\",\"batch_size\":\"None\",\"batch_input_shape\":\"None\",\"dtype\":\"None\",\"input_tensor\":\"None\",\"sparse\":\"None\",\"name\":\"None\"},\"positionX\":291,\"positionY\":99,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node10_0\"}],\"inPorts\":[{\"id\":\"node10_0\"}]},{\"id\":\"node11\",\"name\":\"Layer\",\"icon\":\"task-icon-41\",\"category\":\"04\",\"operator\":\"Layer\",\"children\":[],\"nodeParam\":{},\"positionX\":277,\"positionY\":198,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node11_0\"}],\"inPorts\":[{\"id\":\"node11_0\",\"isConnected\":true}]}],\"paths\":[{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node10_0\",\"endPort\":\"node11\",\"startId\":\"node10\",\"endId\":\"node11\"}]}";
//        String json2 = "{\"nodes\":[{\"id\":\"node10\",\"name\":\"InputLayer\",\"icon\":\"task-icon-41\",\"category\":\"02\",\"operator\":\"InputLayer\",\"children\":[],\"nodeParam\":{\"input_shape\":\"\",\"batch_size\":\"None\",\"batch_input_shape\":\"None\",\"dtype\":\"None\",\"input_tensor\":\"None\",\"sparse\":\"None\",\"name\":\"None\"},\"positionX\":291,\"positionY\":99,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node10_0\"}],\"inPorts\":[{\"id\":\"node10_0\"}]},{\"id\":\"node11\",\"name\":\"Layer\",\"icon\":\"task-icon-41\",\"category\":\"04\",\"operator\":\"Layer\",\"children\":[],\"nodeParam\":{},\"positionX\":121,\"positionY\":193,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node11_0\"}],\"inPorts\":[{\"id\":\"node11_0\",\"isConnected\":true}]},{\"id\":\"node12\",\"name\":\"Layer\",\"icon\":\"task-icon-41\",\"category\":\"04\",\"operator\":\"Layer\",\"children\":[],\"nodeParam\":{},\"positionX\":319,\"positionY\":361,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node12_0\"}],\"inPorts\":[{\"id\":\"node12_0\",\"isConnected\":true}]}],\"paths\":[{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node10_0\",\"endPort\":\"node11\",\"startId\":\"node10\",\"endId\":\"node11\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node11_0\",\"endPort\":\"node12\",\"startId\":\"node11\",\"endId\":\"node12\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node10_0\",\"endPort\":\"node12\",\"startId\":\"node10\",\"endId\":\"node12\"}]}";
//        String json3 = "{\"nodes\":[{\"id\":\"node10\",\"name\":\"InputLayer\",\"icon\":\"task-icon-41\",\"category\":\"02\",\"operator\":\"InputLayer\",\"children\":[],\"nodeParam\":{\"input_shape\":\"\",\"batch_size\":\"None\",\"batch_input_shape\":\"None\",\"dtype\":\"None\",\"input_tensor\":\"None\",\"sparse\":\"None\",\"name\":\"None\"},\"positionX\":242,\"positionY\":213,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node10_0\"}],\"inPorts\":[{\"id\":\"node10_0\"}]},{\"id\":\"node11\",\"name\":\"Layer\",\"icon\":\"task-icon-41\",\"category\":\"04\",\"operator\":\"Layer\",\"children\":[],\"nodeParam\":{},\"positionX\":263,\"positionY\":315,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node11_0\"}],\"inPorts\":[{\"id\":\"node11_0\",\"isConnected\":true}]},{\"id\":\"node12\",\"name\":\"Layer\",\"icon\":\"task-icon-41\",\"category\":\"04\",\"operator\":\"Layer\",\"children\":[],\"nodeParam\":{},\"positionX\":196,\"positionY\":523,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node12_0\"}],\"inPorts\":[{\"id\":\"node12_0\",\"isConnected\":true}]},{\"id\":\"node13\",\"name\":\"BatchNormalization\",\"icon\":\"task-icon-41\",\"category\":\"nl\",\"operator\":\"BatchNormalization\",\"children\":[],\"nodeParam\":{\"axis\":\"1\",\"momentum\":\"0.99\",\"epsilon\":\"0.001\",\"center\":true,\"scale\":true,\"beta_initializer\":\"zeros\",\"gamma_initializer\":\"ones\",\"moving_mean_initializer\":\"zeros\",\"moving_variance_initializer\":\"ones\",\"beta_regularizer\":\"None\",\"gamma_regularizer\":\"None\",\"beta_constraint\":\"None\",\"gamma_constraint\":\"None\"},\"positionX\":442,\"positionY\":405,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node13_0\"}],\"inPorts\":[{\"id\":\"node13_0\",\"isConnected\":true}]}],\"paths\":[{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node10_0\",\"endPort\":\"node11\",\"startId\":\"node10\",\"endId\":\"node11\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node11_0\",\"endPort\":\"node12\",\"startId\":\"node11\",\"endId\":\"node12\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node11_0\",\"endPort\":\"node13\",\"startId\":\"node11\",\"endId\":\"node13\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node13_0\",\"endPort\":\"node12\",\"startId\":\"node13\",\"endId\":\"node12\"}]}";
//
//
//        String json4 = "{\"nodes\":[{\"id\":\"node10\",\"name\":\"InputLayer\",\"icon\":\"task-icon-41\",\"category\":\"02\",\"operator\":\"InputLayer\",\"children\":[],\"nodeParam\":{\"input_shape\":\"\",\"batch_size\":\"None\",\"batch_input_shape\":\"None\",\"dtype\":\"None\",\"input_tensor\":\"None\",\"sparse\":\"None\",\"name\":\"None\"},\"positionX\":243,\"positionY\":54,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node10_0\"}],\"inPorts\":[{\"id\":\"node10_0\"}]},{\"id\":\"node11\",\"name\":\"Layer\",\"icon\":\"task-icon-41\",\"category\":\"04\",\"operator\":\"Layer\",\"children\":[],\"nodeParam\":{},\"positionX\":234,\"positionY\":134,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node11_0\"}],\"inPorts\":[{\"id\":\"node11_0\",\"isConnected\":true}]},{\"id\":\"node12\",\"name\":\"BatchNormalization\",\"icon\":\"task-icon-41\",\"category\":\"nl\",\"operator\":\"BatchNormalization\",\"children\":[],\"nodeParam\":{\"axis\":\"1\",\"momentum\":\"0.99\",\"epsilon\":\"0.001\",\"center\":true,\"scale\":true,\"beta_initializer\":\"zeros\",\"gamma_initializer\":\"ones\",\"moving_mean_initializer\":\"zeros\",\"moving_variance_initializer\":\"ones\",\"beta_regularizer\":\"None\",\"gamma_regularizer\":\"None\",\"beta_constraint\":\"None\",\"gamma_constraint\":\"None\"},\"positionX\":213,\"positionY\":218,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node12_0\"}],\"inPorts\":[{\"id\":\"node12_0\",\"isConnected\":true}]},{\"id\":\"node13\",\"name\":\"ReLU\",\"icon\":\"task-icon-41\",\"category\":\"07\",\"operator\":\"ReLU\",\"children\":[],\"nodeParam\":{\"max_value\":\"None\",\"negative_slope\":\"0.0\",\"threshold\":\"0.0\"},\"positionX\":209,\"positionY\":302,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node13_0\"}],\"inPorts\":[{\"id\":\"node13_0\",\"isConnected\":true}]},{\"id\":\"node14\",\"name\":\"Softmax\",\"icon\":\"task-icon-41\",\"category\":\"07\",\"operator\":\"Softmax\",\"children\":[],\"nodeParam\":{\"axis\":\"-1\"},\"positionX\":169,\"positionY\":361,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node14_0\"}],\"inPorts\":[{\"id\":\"node14_0\",\"isConnected\":true}]},{\"id\":\"node15\",\"name\":\"Add\",\"icon\":\"task-icon-41\",\"category\":\"ml\",\"operator\":\"Add\",\"children\":[],\"nodeParam\":{},\"positionX\":178,\"positionY\":445,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node15_0\"}],\"inPorts\":[{\"id\":\"node15_0\",\"isConnected\":true}]},{\"id\":\"node16\",\"name\":\"Average\",\"icon\":\"task-icon-41\",\"category\":\"ml\",\"operator\":\"Average\",\"children\":[],\"nodeParam\":{},\"positionX\":199,\"positionY\":535,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node16_0\"}],\"inPorts\":[{\"id\":\"node16_0\",\"isConnected\":true}]},{\"id\":\"node17\",\"name\":\"GRU\",\"icon\":\"task-icon-41\",\"category\":\"03\",\"operator\":\"GRU\",\"children\":[],\"nodeParam\":{\"activation\":\"tanh\",\"activity_regularizer\":\"None\",\"bias_constraint\":\"None\",\"bias_initializer\":\"zeros\",\"bias_regularizer\":\"None\",\"dropout\":\"0.0\",\"go_backwards\":false,\"implementation\":\"1\",\"kernel_constraint\":\"None\",\"kernel_initializer\":\"glorot_uniform\",\"kernel_regularizer\":\"None\",\"recurrent_activation\":\"hard_sigmoid\",\"recurrent_constraint\":\"None\",\"recurrent_dropout\":\"0.0\",\"recurrent_initializer\":\"orthogonal\",\"recurrent_regularizer\":\"None\",\"reset_after\":false,\"return_sequences\":false,\"return_state\":false,\"stateful\":false,\"units\":\"\",\"unroll\":false,\"use_bias\":true},\"positionX\":447,\"positionY\":576,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node17_0\"}],\"inPorts\":[{\"id\":\"node17_0\",\"isConnected\":true}]},{\"id\":\"node18\",\"name\":\"LSTM\",\"icon\":\"task-icon-41\",\"category\":\"03\",\"operator\":\"LSTM\",\"children\":[],\"nodeParam\":{\"activation\":\"tanh\",\"activity_regularizer\":\"None\",\"bias_constraint\":\"None\",\"bias_initializer\":\"zeros\",\"bias_regularizer\":\"None\",\"dropout\":\"0.0\",\"go_backwards\":false,\"implementation\":\"1\",\"kernel_constraint\":\"None\",\"kernel_initializer\":\"glorot_uniform\",\"kernel_regularizer\":\"None\",\"recurrent_activation\":\"hard_sigmoid\",\"recurrent_constraint\":\"None\",\"recurrent_dropout\":\"0.0\",\"recurrent_initializer\":\"orthogonal\",\"recurrent_regularizer\":\"None\",\"return_sequences\":false,\"return_state\":false,\"stateful\":false,\"unit_forget_bias\":false,\"units\":\"\",\"unroll\":false,\"use_bias\":true},\"positionX\":92,\"positionY\":603,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node18_0\"}],\"inPorts\":[{\"id\":\"node18_0\",\"isConnected\":true}]},{\"id\":\"node19\",\"name\":\"RNN\",\"icon\":\"task-icon-41\",\"category\":\"03\",\"operator\":\"RNN\",\"children\":[],\"nodeParam\":{\"cell\":\"\",\"go_backwards\":false,\"return_sequences\":false,\"return_state\":false,\"stateful\":false,\"unroll\":false},\"positionX\":192,\"positionY\":708,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node19_0\"}],\"inPorts\":[{\"id\":\"node19_0\",\"isConnected\":true}]}],\"paths\":[{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node10_0\",\"endPort\":\"node11\",\"startId\":\"node10\",\"endId\":\"node11\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node11_0\",\"endPort\":\"node12\",\"startId\":\"node11\",\"endId\":\"node12\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node12_0\",\"endPort\":\"node13\",\"startId\":\"node12\",\"endId\":\"node13\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node13_0\",\"endPort\":\"node14\",\"startId\":\"node13\",\"endId\":\"node14\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node14_0\",\"endPort\":\"node15\",\"startId\":\"node14\",\"endId\":\"node15\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node15_0\",\"endPort\":\"node16\",\"startId\":\"node15\",\"endId\":\"node16\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node16_0\",\"endPort\":\"node17\",\"startId\":\"node16\",\"endId\":\"node17\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node17_0\",\"endPort\":\"node18\",\"startId\":\"node17\",\"endId\":\"node18\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node18_0\",\"endPort\":\"node19\",\"startId\":\"node18\",\"endId\":\"node19\"}]}";
//
//        String json5 = "{\"nodes\":[{\"id\":\"node10\",\"name\":\"AveragePooling1D\",\"icon\":\"task-icon-41\",\"category\":\"05\",\"operator\":\"AveragePooling1D\",\"children\":[],\"nodeParam\":{\"pool_size\":\"2\",\"strides\":\"None\",\"padding\":\"valid\",\"data_format\":\"channels_last\"},\"positionX\":208,\"positionY\":53,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node10_0\"}],\"inPorts\":[{\"id\":\"node10_0\"}]},{\"id\":\"node11\",\"name\":\"MaxPooling1D\",\"icon\":\"task-icon-41\",\"category\":\"05\",\"operator\":\"MaxPooling1D\",\"children\":[],\"nodeParam\":{\"pool_size\":\"2\",\"strides\":\"None\",\"padding\":\"valid\",\"data_format\":\"channels_last\"},\"positionX\":445,\"positionY\":134,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node11_0\"}],\"inPorts\":[{\"id\":\"node11_0\",\"isConnected\":true}]},{\"id\":\"node12\",\"name\":\"Conv1D\",\"icon\":\"task-icon-41\",\"category\":\"08\",\"operator\":\"Conv1D\",\"children\":[],\"nodeParam\":{\"activation\":\"None\",\"activity_regularizer\":\"None\",\"bias_constraint\":\"None\",\"bias_initializer\":\"zeros\",\"bias_regularizer\":\"None\",\"data_format\":\"channels_last\",\"dilation_rate\":\"1\",\"filters\":\"\",\"kernel_constraint\":\"None\",\"kernel_initializer\":\"glorot_uniform\",\"kernel_regularizer\":\"None\",\"kernel_size\":\"\",\"padding\":\"valid\",\"strides\":\"1\",\"use_bias\":true},\"positionX\":84,\"positionY\":165,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node12_0\"}],\"inPorts\":[{\"id\":\"node12_0\",\"isConnected\":true}]},{\"id\":\"node13\",\"name\":\"Cropping1D\",\"icon\":\"task-icon-41\",\"category\":\"08\",\"operator\":\"Cropping1D\",\"children\":[],\"nodeParam\":{\"cropping\":\"(1,1)\"},\"positionX\":354,\"positionY\":212,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node13_0\"}],\"inPorts\":[{\"id\":\"node13_0\",\"isConnected\":true}]},{\"id\":\"node14\",\"name\":\"ZeroPadding1D\",\"icon\":\"task-icon-41\",\"category\":\"08\",\"operator\":\"ZeroPadding1D\",\"children\":[],\"nodeParam\":{\"padding\":\"1\"},\"positionX\":215,\"positionY\":279,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node14_0\"}],\"inPorts\":[{\"id\":\"node14_0\",\"isConnected\":true}]},{\"id\":\"node15\",\"name\":\"Activation\",\"icon\":\"task-icon-41\",\"category\":\"MYSQL\",\"operator\":\"Activation\",\"children\":[],\"nodeParam\":{\"activation\":\"None\"},\"positionX\":215,\"positionY\":348,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node15_0\"}],\"inPorts\":[{\"id\":\"node15_0\",\"isConnected\":true}]},{\"id\":\"node16\",\"name\":\"Dense\",\"icon\":\"task-icon-41\",\"category\":\"MYSQL\",\"operator\":\"Dense\",\"children\":[],\"nodeParam\":{\"activation\":\"None\",\"activity_regularizer\":\"None\",\"bias_constraint\":\"None\",\"bias_initializer\":\"zeros\",\"bias_regularizer\":\"None\",\"kernel_constraint\":\"None\",\"kernel_initializer\":\"glorot_uniform\",\"kernel_regularizer\":\"None\",\"units\":\"None\",\"use_bias\":true},\"positionX\":243,\"positionY\":417,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node16_0\"}],\"inPorts\":[{\"id\":\"node16_0\",\"isConnected\":true}]},{\"id\":\"node17\",\"name\":\"Dropout\",\"icon\":\"task-icon-41\",\"category\":\"MYSQL\",\"operator\":\"Dropout\",\"children\":[],\"nodeParam\":{\"noise_shape\":\"None\",\"rate\":\"\",\"seed\":\"None\"},\"positionX\":78,\"positionY\":536,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node17_0\"}],\"inPorts\":[{\"id\":\"node17_0\",\"isConnected\":true}]},{\"id\":\"node18\",\"name\":\"Flatten\",\"icon\":\"task-icon-41\",\"category\":\"MYSQL\",\"operator\":\"Flatten\",\"children\":[],\"nodeParam\":{\"data_format\":\"None\"},\"positionX\":297,\"positionY\":498,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node18_0\"}],\"inPorts\":[{\"id\":\"node18_0\",\"isConnected\":true}]},{\"id\":\"node19\",\"name\":\"Lambda\",\"icon\":\"task-icon-41\",\"category\":\"MYSQL\",\"operator\":\"Lambda\",\"children\":[],\"nodeParam\":{\"arguments\":\"None\",\"function\":\"\",\"mask\":\"None\",\"output_shape\":\"None\"},\"positionX\":294,\"positionY\":608,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"node19_0\"}],\"inPorts\":[{\"id\":\"node19_0\",\"isConnected\":true}]}],\"paths\":[{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node10_0\",\"endPort\":\"node11\",\"startId\":\"node10\",\"endId\":\"node11\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node11_0\",\"endPort\":\"node12\",\"startId\":\"node11\",\"endId\":\"node12\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node12_0\",\"endPort\":\"node13\",\"startId\":\"node12\",\"endId\":\"node13\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node13_0\",\"endPort\":\"node14\",\"startId\":\"node13\",\"endId\":\"node14\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node14_0\",\"endPort\":\"node15\",\"startId\":\"node14\",\"endId\":\"node15\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node15_0\",\"endPort\":\"node16\",\"startId\":\"node15\",\"endId\":\"node16\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node16_0\",\"endPort\":\"node18\",\"startId\":\"node16\",\"endId\":\"node18\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node18_0\",\"endPort\":\"node17\",\"startId\":\"node18\",\"endId\":\"node17\"},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"node17_0\",\"endPort\":\"node19\",\"startId\":\"node17\",\"endId\":\"node19\"}]}";
//
//        String json6 = "{\"nodes\":[{\"id\":1,\"name\":\"ReLU\",\"icon\":\"task-icon-41\",\"category\":\"07\",\"operator\":\"ReLU\",\"children\":[],\"nodeParam\":{\"max_value\":\"None\",\"negative_slope\":\"0.0\",\"threshold\":\"0.0\"},\"positionX\":259,\"positionY\":90,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"1_0\"}],\"inPorts\":[{\"id\":\"1_0\"}]},{\"id\":2,\"name\":\"Softmax\",\"icon\":\"task-icon-41\",\"category\":\"07\",\"operator\":\"Softmax\",\"children\":[],\"nodeParam\":{\"axis\":\"-1\"},\"positionX\":125,\"positionY\":330,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"2_0\"}],\"inPorts\":[{\"id\":\"2_0\",\"isConnected\":true}]},{\"id\":3,\"name\":\"BatchNormalization\",\"icon\":\"task-icon-41\",\"category\":\"nl\",\"operator\":\"BatchNormalization\",\"children\":[],\"nodeParam\":{\"axis\":\"1\",\"momentum\":\"0.99\",\"epsilon\":\"0.001\",\"center\":true,\"scale\":true,\"beta_initializer\":\"zeros\",\"gamma_initializer\":\"ones\",\"moving_mean_initializer\":\"zeros\",\"moving_variance_initializer\":\"ones\",\"beta_regularizer\":\"None\",\"gamma_regularizer\":\"None\",\"beta_constraint\":\"None\",\"gamma_constraint\":\"None\"},\"positionX\":281,\"positionY\":263,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"3_0\"}],\"inPorts\":[{\"id\":\"3_0\",\"isConnected\":true}]}],\"paths\":[{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"1_0\",\"endPort\":2,\"startId\":1,\"endId\":2},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"1_0\",\"endPort\":3,\"startId\":1,\"endId\":3},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"3_0\",\"endPort\":2,\"startId\":3,\"endId\":2}]}";
//
//        String json7 = "{\"nodes\":[{\"id\":1,\"name\":\"InputLayer\",\"icon\":\"task-icon-41\",\"category\":\"02\",\"operator\":\"InputLayer\",\"children\":[],\"nodeParam\":{\"input_shape\":\"\",\"batch_size\":\"None\",\"batch_input_shape\":\"None\",\"dtype\":\"None\",\"input_tensor\":\"None\",\"sparse\":\"None\",\"name\":\"None\"},\"positionX\":178,\"positionY\":119,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"1_0\"}],\"inPorts\":[{\"id\":\"1_0\"}]},{\"id\":2,\"name\":\"InputLayer\",\"icon\":\"task-icon-41\",\"category\":\"02\",\"operator\":\"InputLayer\",\"children\":[],\"nodeParam\":{\"input_shape\":\"\",\"batch_size\":\"None\",\"batch_input_shape\":\"None\",\"dtype\":\"None\",\"input_tensor\":\"None\",\"sparse\":\"None\",\"name\":\"None\"},\"positionX\":436,\"positionY\":128,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"2_0\"}],\"inPorts\":[{\"id\":\"2_0\"}]},{\"id\":3,\"name\":\"Add\",\"icon\":\"task-icon-41\",\"category\":\"ml\",\"operator\":\"Add\",\"children\":[],\"nodeParam\":{},\"positionX\":278,\"positionY\":260,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"3_0\"}],\"inPorts\":[{\"id\":\"3_0\",\"isConnected\":true}]},{\"id\":4,\"name\":\"Dense\",\"icon\":\"task-icon-41\",\"category\":\"MYSQL\",\"operator\":\"Dense\",\"children\":[],\"nodeParam\":{\"activation\":\"None\",\"activity_regularizer\":\"None\",\"bias_constraint\":\"None\",\"bias_initializer\":\"zeros\",\"bias_regularizer\":\"None\",\"kernel_constraint\":\"None\",\"kernel_initializer\":\"glorot_uniform\",\"kernel_regularizer\":\"None\",\"units\":\"None\",\"use_bias\":true},\"positionX\":266,\"positionY\":348,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"4_0\"}],\"inPorts\":[{\"id\":\"4_0\",\"isConnected\":true}]}],\"paths\":[{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"1_0\",\"endPort\":3,\"startId\":1,\"endId\":3},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"2_0\",\"endPort\":3,\"startId\":2,\"endId\":3},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"3_0\",\"endPort\":4,\"startId\":3,\"endId\":4}]}";
//
//        String json8 = "{\"nodes\":[{\"id\":1,\"name\":\"" +
//                "InputLayer\",\"icon\":\"task-icon-41\",\"category\":\"02\",\"operator\":\"InputLayer\",\"children\":[],\"nodeParam\":{\"input_shape\":\"\",\"batch_size\":\"'True'\",\"batch_input_shape\":\"true\",\"dtype\":\"None\",\"input_tensor\":\"None\",\"sparse\":\"None\",\"name\":\"None\"},\"positionX\":207,\"positionY\":141,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"1_0\"}],\"inPorts\":[{\"id\":\"1_0\"}]},{\"id\":2,\"name\":\"InputLayer\",\"icon\":\"task-icon-41\",\"category\":\"02\",\"operator\":\"InputLayer\",\"children\":[],\"" +
//                "nodeParam\":{\"input_shape\":\"\",\"batch_size\":\"\",\"batch_input_shape\":\"123\",\"dtype\":\"None\",\"input_tensor\":\"None\",\"sparse\":\"None\",\"name\":\"None\"}," +
//                "\"positionX\":427,\"positionY\":143,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"2_0\"}],\"inPorts\":[{\"id\":\"2_0\"}]},{\"id\":3,\"name\":\"Softmax\",\"icon\":\"task-icon-41\",\"category\":\"07\",\"operator\":\"Softmax\",\"children\":[],\"nodeParam\":{\"axis\":\"-1\"},\"positionX\":201,\"positionY\":221,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"3_0\"}],\"inPorts\":[{\"id\":\"3_0\",\"isConnected\":true}]},{\"id\":4,\"name\":\"Add\",\"icon\":\"task-icon-41\",\"category\":\"ml\",\"operator\":\"Add\",\"children\":[],\"nodeParam\":{},\"positionX\":313,\"positionY\":330,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"4_0\"}],\"inPorts\":[{\"id\":\"4_0\",\"isConnected\":true}]},{\"id\":5,\"name\":\"Softmax\",\"icon\":\"task-icon-41\",\"category\":\"07\",\"operator\":\"Softmax\",\"children\":[],\"nodeParam\":{\"axis\":\"-1\"},\"positionX\":298,\"positionY\":406,\"showStatus\":true,\"class_id\":null,\"outPorts\":[{\"id\":\"5_0\"}],\"inPorts\":[{\"id\":\"5_0\",\"isConnected\":true}]}],\"paths\":[{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"4_0\",\"endPort\":5,\"startId\":4,\"endId\":5},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"2_0\",\"endPort\":4,\"startId\":2,\"endId\":4},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"3_0\",\"endPort\":4,\"startId\":3,\"endId\":4},{\"dotted\":false,\"ptype\":\"Q\",\"startPort\":\"1_0\",\"endPort\":3,\"startId\":1,\"endId\":3}]}";

        Gson gson = new Gson();
        DLCanvas data = gson.fromJson(jsonStr, DLCanvas.class);

        System.out.println(data);
        StringBuffer buffer = new StringBuffer();
        buffer.append("import tensorflow as tf\n" +
                "from tensorflow import keras\n");


        HashMap<String, Nodes> map = new HashMap<>();
        for (Nodes node : data.getNodes()) {
            map.put(node.getId(), node);
        }

        //把边信息加入到node里面
        data.getPaths().forEach(path -> {
            map.get(path.getStartId()).addNext(path.getEndId());
            map.get(path.getEndId()).addPrev(path.getStartId());
        });

        //遍历边然后开始写入缓冲区
        for (Paths path : data.getPaths()) {
            write(map.get(path.getStartId()), buffer, map);
            write(map.get(path.getEndId()), buffer, map);
        }

        buffer.append("model = tf.keras.models.Model(inputs=" + getInNode(data).toString() + ", outputs=" + getOutNode(data).toString() + ")");
        System.out.println(buffer);
        return buffer.toString();
    }

    /**
     * 链表的递归调用方法，生成逐行代码
     *
     * @param node
     * @param buffer
     * @param map
     */
    private static void write(Nodes node, StringBuffer buffer, HashMap<String, Nodes> map) {

        //node已经执行过就直接退出方法
        if (node.getStatus() == 1) {
            return;
        }

        //遍历前面的节点，确保前面的都是执行过的
        String s = "";
        for (String PrevNode : node.getPrev()) {
            if (map.get(PrevNode).getStatus() == 0) {
                write(map.get(PrevNode), buffer, map);
            }
        }

        //执行此节点
        if (node.getName().equals("add")) {
            s = "X_" + node.getId() + "=" + "keras.layers." + node.getName() + formatNodePrev(node.getPrev());
        } else if (node.getName().equals("InputLayer")) {
            HashMap<String, String> nodeParam = node.getNodeParam();
            if (nodeParam.get("batch_size").equals("None") || nodeParam.get("batch_size").equals("")) {
                nodeParam.put("batch_size", "128");
            }
            if (nodeParam.get("input_shape").equals("None") || nodeParam.get("input_shape").equals("")) {
                nodeParam.put("input_shape", "(25,25,3)");
            }


            s = "X_" + node.getId() + "=" + "keras.layers." + node.getName() + "(" + node.getNodeParam().toString().substring(1, node.getNodeParam().toString().length() - 1) + ")" + formatNodePrev(node.getPrev());
        } else {
            s = "X_" + node.getId() + "=" + "keras.layers." + node.getName() + "(" + node.getNodeParam().toString().substring(1, node.getNodeParam().toString().length() - 1) + ")" + formatNodePrev(node.getPrev());
        }

        buffer.append(s);
        buffer.append("\n");

        //将节点状态改为1
        node.setStatus(1);
    }

    /**
     * 格式化输出
     *
     * @param prevSet
     * @return
     */
    private static String formatNodePrev(Set prevSet) {
        if (prevSet.isEmpty()) {
            return "";
        }

        String str = "(";
        if (prevSet.size() == 1) {
            for (Object o : prevSet) {
                str += "X_" + o.toString();
            }
            return str + ")";
        }
        str += "[";
        for (Object o : prevSet) {
            str += "X_" + o.toString() + ",";
        }
        return str.substring(0, str.length() - 1) + "])";
    }

    /**
     * 得到最开始的节点，也就是输入节点，输入节点可能有多个
     *
     * @param data
     * @return
     */
    private static List<String> getInNode(com.example.demo.entry.DLCanvas.DLCanvas data) {

        ArrayList<String> list = new ArrayList<>();

        for (Nodes node : data.getNodes()) {
            if (node.getPrev().isEmpty()) {
                list.add("X_" + node.getId());
            }
        }

        return list;
    }

    /**
     * 遍历查找输出节点，也是可能有多个
     *
     * @param data
     * @return
     */
    private static List<String> getOutNode(com.example.demo.entry.DLCanvas.DLCanvas data) {

        ArrayList<String> list = new ArrayList<>();

        for (Nodes node : data.getNodes()) {
            if (node.getNext().isEmpty()) {
                list.add("X_" + node.getId());
            }
        }
        return list;
    }
}
