
# react-native-zendeskchat

## Getting started

`$ npm install react-native-zendeskchat --save`

### Mostly automatic installation

`$ react-native link react-native-zendeskchat`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-zendeskchat` and add `RNZendeskchat.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNZendeskchat.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNZendeskchatPackage;` to the imports at the top of the file
  - Add `new RNZendeskchatPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-zendeskchat'
  	project(':react-native-zendeskchat').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-zendeskchat/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-zendeskchat')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNZendeskchat.sln` in `node_modules/react-native-zendeskchat/windows/RNZendeskchat.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Zendeskchat.RNZendeskchat;` to the usings at the top of the file
  - Add `new RNZendeskchatPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNZendeskchat from 'react-native-zendeskchat';

// TODO: What to do with the module?
RNZendeskchat;
```
  