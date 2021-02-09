class BaseClass {
  def BaseClass() {
    // Does something with options,
    // mainly initialization.
    echo "basector"
  }
  // More methods
}

class AnotherClass extends BaseClass {
  def AnotherClass(options) {
      echo "child ctor"
  }
  // Does stuff
}

return this