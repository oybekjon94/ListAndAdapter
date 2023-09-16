# ListAndAdapter
## ListView
listView is a widget that displays list-type data and is the most important and widely used element in Android.
As the name suggests, ListView must have data in the form of a list. It serves to connect each data and view through the adapter.
Items displayed in ListView can be as simple as text, or they can be complex using a combination of different views.

## Adapter
It was said that in order to display data on the screen using ListView, an Adapter must be used. What role does an adapter play? Let’s find out a little more.
The relationship between data, Adapter, and ListView is as follows.

![image](https://github.com/oybekjon94/ListAndAdapter/assets/91370134/d5dd2d03-e3df-4393-ac58-a32b23b00fbf)

As shown in the picture above, data goes up on the ListView through the Adapter. Here, the Adapter plays the role of managing data and creating views.
In other words, Adapter is an object used to output data to ListView and can be seen as an object that connects data and View.
