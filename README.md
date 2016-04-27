# EasyDroid-SharedPreferences
Helper classes to make it easier to use sharedpreferences. Preference items look like a plain old variable with sharedpreferences operations behind it.


# Usage

You can refer to the app as a demo. You may have already got bored of the stuff like this:

``` java
// While I wanna save a preference
//When I was new to Android, it is terrible for me to commit after update a value like that above. 
context.getSharedPreferences("whatever a name", Context.MODE_PRIVATE)
.edit().putString("aKey", "aValue").commit();

context.getSharedPreferences("whatever a name", Context.MODE_PRIVATE)
.getString("blahblah", "default");
```

You shall never do this repeatedly. Behold,

``` java
StringPreference sp = new StringPreference(context, "name of the shared preference", "key", "defaultValue");

String value = sp.val(); // get the preference value.
sp.set("New Value"); // update it.
```
Some params of the constructor are optional such as the default value.

It's easy and let the blahblah things be gone.

Cool, isn't it?