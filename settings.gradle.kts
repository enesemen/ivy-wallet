dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}
rootProject.name = "Ivy Wallet"
include(":app")
include(":common")
include(":ui-common")
include(":reports")
include(":accounts")
include(":categories")
include(":home")
include(":more-menu")
include(":planned-payments")
include(":transaction-details")
include(":pie-charts")
include(":budgets")
include(":loans")
include(":settings")
include(":onboarding")
include(":item-transactions")
include(":account-transactions")
include(":category-transactions")
include(":search-transactions")
include(":screens")
include(":data-model")
include(":planned-payment-details")
include(":network-common")
include(":test-common")
include(":ui-test-common")
include(":exchange")
include(":db-persistence")
include(":donate")
include(":main")
include(":app-base")
include(":ui-components-old")
include(":customer-journey")
include(":temp-domain")
include(":temp-persistence")