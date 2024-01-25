package soy.gabimoreno.merge2classesrefactorexample.classes

class FooLegacy(
    override val property: String,
    override val fooLegacyProperty: String,
) : soy.gabimoreno.merge2classesrefactorexample.interfaces.FooLegacy {

    override fun method() {

    }

    override fun fooLegacyMethod() {

    }
}
