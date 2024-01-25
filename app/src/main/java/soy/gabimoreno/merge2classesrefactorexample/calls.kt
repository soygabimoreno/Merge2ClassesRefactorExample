package soy.gabimoreno.merge2classesrefactorexample

import soy.gabimoreno.merge2classesrefactorexample.classes.Foo
import soy.gabimoreno.merge2classesrefactorexample.classes.FooLegacy
import soy.gabimoreno.merge2classesrefactorexample.proxy.FooProxy
import soy.gabimoreno.merge2classesrefactorexample.proxy.IsFeatureFlagEnabled

fun oldCalls() {
    val foo = Foo(
        property = "property",
        fooProperty = "fooProperty"
    )
    val fooLegacy = FooLegacy(
        property = "property",
        fooLegacyProperty = "fooLegacyProperty"
    )
}

fun newCalls() {
    val foo = FooProxy(IsFeatureFlagEnabled()).getFoo()
    val fooLegacy = FooProxy(IsFeatureFlagEnabled()).getFooLegacy()
}
