# EasyDroid-SharedPreferences
Helper classes to make it easier to use sharedpreferences. Preference items look like a plain old variable with sharedpreferences operations behind it.


# How to use

Copy directory 'library' to your Android Studio project and make it a module, add configuration in your build.gradle file:

```groovy
compile project(':library')
```
This is temporary and I am considering uploading those to maven so that you can just add a maven dependency instead.

You can refer to the app as a demo. You may have already got bored of the stuff like this:

``` java
//When I was new to Android, it is terrible for me to commit after update a value like that. 
context.getSharedPreferences("whatever a name", Context.MODE_PRIVATE)
.edit().putString("aKey", "aValue").commit();

context.getSharedPreferences("whatever a name", Context.MODE_PRIVATE)
.getString("blahblah", "default");
```

You shall never do that repeatedly. Behold,

``` java
StringPreference sp = new StringPreference(context, "name of the shared preference", "key", "defaultValue");

String value = sp.val(); // get the preference value.
sp.set("New Value"); // update it.
```
Everytime you wanna get or set the value, just call a simple method. Some params of the constructor are optional such as the default value.

It's easy and let the blahblah things be gone.

Cool, isn't it?
