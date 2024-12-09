package de.darthkali.springmodulith.shoppingcard

import org.springframework.modulith.ApplicationModule
import org.springframework.modulith.NamedInterface
import org.springframework.modulith.PackageInfo

@PackageInfo
@NamedInterface("moduleapi")
@ApplicationModule(
    allowedDependencies = ["product :: open", "product :: dto"]
)
class ModuleMetadata {}

