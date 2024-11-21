package de.darthkali.springmodulith



import org.springframework.modulith.core.ApplicationModule
import org.springframework.modulith.core.ApplicationModules
import org.springframework.modulith.docs.Documenter
import java.util.function.Consumer
import kotlin.test.Test


class SpringModulithApplicationKtTest{


    @Test
    fun createApplicationModuleModel() {
        val modules = ApplicationModules.of(SpringModulithApplication::class.java)
        modules.forEach(Consumer { x: ApplicationModule? -> println(x) })
    }

    @Test
    fun verifiesModularStructure() {
        val modules = ApplicationModules.of(SpringModulithApplication::class.java)
        modules.verify()
    }

    @Test
    fun createModuleDocumentation() {
        val modules = ApplicationModules.of(SpringModulithApplication::class.java)
        Documenter(modules)
            .writeDocumentation()
            .writeIndividualModulesAsPlantUml()
    }
}