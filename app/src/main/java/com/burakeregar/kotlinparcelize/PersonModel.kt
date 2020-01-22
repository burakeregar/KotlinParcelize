package com.burakeregar.kotlinparcelize

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Burak Eregar on 1.12.2017.
 * burakeregar@gmail.com
 * https://github.com/burakeregar
 */

@Parcelize
data class PersonModel(val name: String, val age: Int) : Parcelable


/*
 Android Extensions plugin now includes an automatic Parcelable implementation generator.
 Declare the serialized properties in a primary constructor and add a @Parcelize annotation,
 and writeToParcel()/createFromParcel() methods will be created automatically.


How To Use:
Add the code below into your gradle.
androidExtensions {
    experimental = true
}

You also need to add apply plugin: ‘kotlin-android-extensions’ to your gradle file.
However, if you have created your project using Kotlin support, it should be added automatically.
Then add @Parcelize annotation to your model. That’s it! You don’t need to write any parcel methods anymore!
*/

/*
* We can write equivalent PersonModel class in Java as the following:
*
  public class Student implements Parcelable{
        private String id;
        private String name;
        private String grade;

        // Constructor
        public Student(String id, String name, String grade){
            this.id = id;
            this.name = name;
            this.grade = grade;
       }
       // Getter and setter methods
       .........
       .........

       // Parcelling part
       public Student(Parcel in){
           String[] data = new String[3];

           in.readStringArray(data);
           // the order needs to be the same as in writeToParcel() method
           this.id = data[0];
           this.name = data[1];
           this.grade = data[2];
       }

       @Оverride
       public int describeContents(){
           return 0;
       }

       @Override
       public void writeToParcel(Parcel dest, int flags) {
           dest.writeStringArray(new String[] {this.id,
                                               this.name,
                                               this.grade});
       }
       public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
           public Student createFromParcel(Parcel in) {
               return new Student(in);
           }

           public Student[] newArray(int size) {
               return new Student[size];
           }
       };
   }
* */