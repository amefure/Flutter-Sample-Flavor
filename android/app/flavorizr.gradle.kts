import com.android.build.gradle.AppExtension

val android = project.extensions.getByType(AppExtension::class.java)

android.apply {
    flavorDimensions("flavor-type")

    productFlavors {
        create("dev") {
            dimension = "flavor-type"
            applicationId = "com.example.sample.dev"
            resValue(type = "string", name = "app_name", value = "MyApp Debug")
        }
        create("stg") {
            dimension = "flavor-type"
            applicationId = "com.example.sample.stg"
            resValue(type = "string", name = "app_name", value = "MyApp Staging")
        }
        create("prod") {
            dimension = "flavor-type"
            applicationId = "com.example.sample"
            resValue(type = "string", name = "app_name", value = "MyApp Release")
        }
    }
}