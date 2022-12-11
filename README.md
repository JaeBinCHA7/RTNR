# Real-Time-Noise-Reducer

RTNR enables the use of deep learning-based real-time speech enhancement technology in the Android mobile environment.
When given a certain audio sample, it immediately outputs noise-removed speech.
## Demo
[https://user-images.githubusercontent.com/87358781/203532969-44e8c9e1-9632-43e9-b6c0-e4cd64ea4003.mp4](https://user-images.githubusercontent.com/87358781/203690680-cc53a848-c6db-4a5e-8db7-dd397ccbd784.mp4)

# Usage
## Step 1
Add it in your root build.gradle at the end of repositories:
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
## Step 2
Add the dependency
```
dependencies {
        implementation 'com.github.JaeBinCHA7:RTNR:Tag'
}
```
## Step 3
Declare the RTNR class (rtNoiseReducer) in your class.
```
void initRTNR(){
    try {
        rtNoiseReducer = new rtNoiseReducer(getActivity());
    } catch (IOException e) {
        Log.d("class", "Failed to create noise reduction");
    }
}
```

## Step 4
Input audio samples as many as 256 double arrays to the audioSE() function of the rtNoiseReducer class.
In this example, the data type for audio playback is a byte type, so I converted it to a double type.
```
short[] shortData = byteArrayToShortArray(writeData); // 512 -> 256
double[] doubleData = shortArrayToDoubleArray(shortData); // 256 -> 256
double[] se_out = rtNoiseReducer.audioSE(doubleData);
shortData = doubleArrayToShortArray(se_out);
writeData = shortArrayToByteArray(shortData);
```
For a detailed example, see the link.
[[code]](https://github.com/JaeBinCHA7/NUNet-Realtime-SpeechEnhancement-Mobile-App)

## Requirements
 <img src="https://img.shields.io/badge/TensorFlow2.9-FF6F00?style=flat&logo=TensorFlow&logoColor=white"/> <img src="https://img.shields.io/badge/Python3.7-3776AB?style=flat&logo=Python&logoColor=white"/> <img src="https://img.shields.io/badge/Android Studio-3DDC84?style=flat&logo=Android Studio&logoColor=white"/> <img src="https://img.shields.io/badge/Ubuntu20.04-E95420?style=flat&logo=Ubuntu&logoColor=white"/>
 
This repo is tested with Ubuntu 20.04, Tensorflow 2.9, Python3.7, CUDA11.6. For package dependencies
