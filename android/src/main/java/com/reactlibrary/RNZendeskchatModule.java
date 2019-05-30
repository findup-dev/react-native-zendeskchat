
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.zopim.android.sdk.api.ZopimChat;
import com.zopim.android.sdk.model.VisitorInfo;
import com.zopim.android.sdk.prechat.ZopimChatActivity;

public class RNZendeskchatModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNZendeskchatModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNZendeskchat";
  }

  @ReactMethod
  public void init(String key){
    ZopimChat.init(key);
  }

  @ReactMethod
  public void startChat(ReadableMap options) {
    setVisitorInfo(options);
    Activity activity = getCurrentActivity();
    if (activity != null) {
      activity.startActivity(new Intent(mReactContext, ZopimChatActivity.class));
    }
  }

  @ReactMethod
  public void setVisitorInfo(ReadableMap options) {
    VisitorInfo.Builder builder = new VisitorInfo.Builder();

    if (options.hasKey("name")) {
      builder.name(options.getString("name"));
    }
    if (options.hasKey("email")) {
      builder.email(options.getString("email"));
    }
    if (options.hasKey("phone")) {
      builder.phoneNumber(options.getString("phone"));
    }

    if(options.hasKey("departament")){
      builder.departament(options.getString("departament"));
    }

    if(options.hasKey("message")){
      builder.message(options.getString("message"));
    }

    VisitorInfo visitorData = builder.build();

    ZopimChat.setVisitorInfo(visitorData);
  }
}