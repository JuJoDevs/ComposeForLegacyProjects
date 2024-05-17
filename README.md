# Legacy Project with Jetpack Compose Integration

This project is an experiment to integrate Jetpack Compose into a legacy Android application. The main goal is to use a generic `Activity` or `Fragment` as the entry point within a Compose module, utilizing the latest `navigation-compose` library to enable navigation at any point in the legacy application.

## Purpose

The primary objective of this project is to demonstrate how to:
1. Integrate Jetpack Compose in a legacy Android project.
2. Use `navigation-compose` to handle navigation with serializable classes.
3. Navigate through various parts of the legacy application using `ComposeEntryActivity` and `ComposeEntryFragment`.

## Example Usage

### Using `ComposeEntryActivity`
```kotlin
private fun setListeners() {
    with(binding) {
        btFragment.setOnClickListener {
            startActivity(FragmentActivity.create(this@MainActivity))
        }
        btScreenA.setOnClickListener {
            startComposeEntryActivity(FeatureARoutes.ScreenA("Activity"))
        }
        btScreenB.setOnClickListener {
            startComposeEntryActivity(FeatureARoutes.ScreenB)
        }
        btScreenC.setOnClickListener {
            startComposeEntryActivity(FeatureARoutes.ScreenC)
        }
        btScreenD.setOnClickListener {
            startComposeEntryActivity(FeatureBRoutes.ScreenD)
        }
        btScreenE.setOnClickListener {
            startComposeEntryActivity(FeatureBRoutes.ScreenE)
        }
        btScreenF.setOnClickListener {
            startComposeEntryActivity(FeatureBRoutes.ScreenF)
        }
    }
}

private fun startComposeEntryActivity(route: NavRoute) {
    startActivity(ComposeEntryActivity.create(this, route))
}
```

### Using `ComposeEntryFragment`
```kotlin
private fun setListeners() {
    binding.btScreenA.setOnClickListener {
        navigate(FeatureARoutes.ScreenA("Fragment"))
    }
    binding.btScreenB.setOnClickListener {
        navigate(FeatureARoutes.ScreenB)
    }
    binding.btScreenC.setOnClickListener {
        navigate(FeatureARoutes.ScreenC)
    }
    binding.btScreenD.setOnClickListener {
        navigate(FeatureBRoutes.ScreenD)
    }
    binding.btScreenE.setOnClickListener {
        navigate(FeatureBRoutes.ScreenE)
    }
    binding.btScreenF.setOnClickListener {
        navigate(FeatureBRoutes.ScreenF)
    }
}

private fun navigate(destination: NavRoute) {
    ComposeEntryFragment.setRoute(destination)
    findNavController().navigate(R.id.action_FirstFragment_to_composeEntryFragment)
}
```

Once the Activity or Fragment is initiated, navigation continues using Compose and the navigation-compose library.

## Project Structure
```text
project
|- app
|- core
|   |- common
|   |- ui
|- compose
|- navigation
|- featureA
|   |- navigation
|   |- routes
|   |- presentation
|- featureB
    |- navigation
    |- routes
    |- presentation
```

## Conclusion
This project demonstrates a great integration of Jetpack Compose into a legacy Android application. By leveraging navigation-compose and generic entry points such as Activity and Fragment, it enables flexible navigation throughout the app, providing a robust foundation for modernizing legacy codebases.
