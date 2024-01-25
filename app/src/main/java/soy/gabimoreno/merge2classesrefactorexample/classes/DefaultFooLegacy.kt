package soy.gabimoreno.merge2classesrefactorexample.classes

import soy.gabimoreno.merge2classesrefactorexample.interfaces.Foo as DefaultFooI
import soy.gabimoreno.merge2classesrefactorexample.interfaces.NewFoo as NewFooI

class DefaultFooLegacy(
    override val property: String,
    override val fooProperty: String,
    override val fooLegacyProperty: String = "",
) : DefaultFooI, NewFooI {

    override fun method() {

    }

    override fun fooMethod() {

    }

    override fun fooLegacyMethod() {
    }
}
