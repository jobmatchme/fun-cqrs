---
layout: docs
title: Introduction
---

# Introduction

**Fun.CQRS** is a Scala CQRS/ES framework. It provides the basic blocks to build event driven aggregates with *Event Sourcing*.

*Fun.CQRS* provides a out-of-the-box `AkkaBackend` and a `InMemoryBackend` for testing. However, it’s designed as such that other backend implementations are possible. For instance, an alternative Akka backend based on [Eventuate](https://github.com/RBMHTechnology/eventuate), a Slick backend or RxScala backend could be implementated and plugged in easily.


## Project Information

**Fun.CQRS** is open source software. Source code is available at:  
https://github.com/strongtyped/fun-cqrs (development branch)

Stable and released branch can be found at:  
https://github.com/strongtyped/fun-cqrs/tree/master

**Project artifact**  

The artifacts are published to Sonatype Repository. Simply add the following to your build.sbt.

  
```tut:evaluated
println(s"""libraryDependencies += "io.strongtyped" %% "fun-cqrs-akka" % "${funcqrs.BuildInfo.version}"""")
```

For testing you can include the test kit.

```tut:evaluated
println(s"""libraryDependencies += "io.strongtyped" %% "fun-cqrs-test-kit" % "${funcqrs.BuildInfo.version}"""")

```

If you want to hack **Fun.CQRS** and develop your own backend, you can import only the core module.
The core module does NOT include the Akka backend.

```tut:evaluated
println(s"""libraryDependencies += "io.strongtyped" %% "fun-cqrs-core" % "${funcqrs.BuildInfo.version}"""")
```


## License
This software is licensed under the Apache 2 license, quoted below.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this project except in compliance with
the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
language governing permissions and limitations under the License.

Copyright 2014 Strong[Typed] (@StrongTyped)

## Contribution policy

Contributions via GitHub pull requests are gladly accepted from their original author. Along with any pull requests, please state that the contribution is your original work and that you license the work to the project under the project's open source license. Whether or not you state this explicitly, by submitting any copyrighted material via pull request, email, or other means you agree to license the material under the project's open source license and warrant that you have the legal authority to do so.
