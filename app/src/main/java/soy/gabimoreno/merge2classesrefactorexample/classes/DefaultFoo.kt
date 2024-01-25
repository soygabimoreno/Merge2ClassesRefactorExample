package soy.gabimoreno.merge2classesrefactorexample.classes

import soy.gabimoreno.merge2classesrefactorexample.interfaces.Foo as FooI
import soy.gabimoreno.merge2classesrefactorexample.interfaces.NewFoo as NewFooI

class DefaultFoo(
    override val property: String,
    override val fooProperty: String,
    override val fooLegacyProperty: String = "",
) : FooI, NewFooI {

    override fun method() {

    }

    override fun fooMethod() {

    }

    override fun fooLegacyMethod() {
    }
}
