enum Flavor {
  dev,
  stg,
  prod,
}

class F {
  static late final Flavor appFlavor;

  static String get name => appFlavor.name;

  static String get title {
    switch (appFlavor) {
      case Flavor.dev:
        return 'MyApp Debug';
      case Flavor.stg:
        return 'MyApp Staging';
      case Flavor.prod:
        return 'MyApp Release';
    }
  }

}
