package com.train.kotlin
import java.util.*

fun main(args: Array<String>) {

        val scanner = Scanner(System.`in`)
        print("Please enter object's length: ")
        val length:Float = try { scanner.nextFloat() } catch (e:InputMismatchException){ 0f }
        print("Please enter object's width: ")
        val width:Float =  try { scanner.nextFloat() } catch (e:InputMismatchException){ 0f }
        print("Please enter object's height: ")
        val height =  try { scanner.nextInt() } catch (e:InputMismatchException){ 0 }

        when{
            Box3().validate(length,width,height) -> println("Box3")
            Box5().validate(length,width,height) -> println("Box5")

        }
}
class Box3 : Box(mLength = 23f,mWidth = 14f,mHeight = 13)
class Box5 : Box(mLength = 39.5f,mWidth = 27.5f,mHeight = 23)
open class Box(var mLength:Float,var mWidth:Float ,var mHeight:Int) {
    fun validate(length:Float, width:Float , height:Int)=
        (length <= mLength && width <= mWidth && height<=mHeight)

}

