package soy.gabimoreno.merge2classesrefactorexample.classes

import soy.gabimoreno.merge2classesrefactorexample.interfaces.FooContract

class Foo(
    override val property: String,
    override val fooProperty: String,
) : FooContract {

    override fun method() {

    }

    override fun fooMethod() {

    }
}
