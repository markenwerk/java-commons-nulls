# Some common null objects for Java

[![Build Status](https://travis-ci.org/markenwerk/java-commons-nulls.svg?branch=master)](https://travis-ci.org/markenwerk/java-commons-nulls)
[![Coverage Status](https://coveralls.io/repos/markenwerk/java-commons-nulls/badge.svg?branch=master&service=github)](https://coveralls.io/github/markenwerk/java-commons-nulls?branch=master)
[![Dependency Status](https://www.versioneye.com/user/projects/573f0f80ce8d0e004130bee4/badge.svg)](https://www.versioneye.com/user/projects/573f0f80ce8d0e004130bee4)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.markenwerk/commons-nulls/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.markenwerk/commons-nulls)
[![Java SE 6](https://img.shields.io/badge/java-SE_6-brightgreen.svg)](http://docs.oracle.com/javase/6/docs/api/)
[![MIT License](https://img.shields.io/badge/license-MIT-brightgreen.svg)](https://github.com/markenwerk/java-commons-nulls/blob/master/LICENSE)

## Overview

This is a collection of null objects (i.e. implementations that do nothing) for the following use cases:

- [`InputStream` and `OutputStream`](#inputstream-and-outputstream)
- [`Reader` and `Writer`](#reader-and-writer)

This library is hosted in the [Maven Central Repository](https://maven-badges.herokuapp.com/maven-central/net.markenwerk/commons-nulls). You can use it with the following coordinates:

```xml
<dependency>
	<groupId>net.markenwerk</groupId>
	<artifactId>commons-nulls</artifactId>
	<version>1.0.1</version>
</dependency>
```

Consult the [usage description](#usage) and [Javadoc](https://markenwerk.github.io/java-commons-nulls/index.html) for further information.

## Usage

### `InputStream` and `OutputStream`

This library provides [`NullInputStream`][NullInputStream] as a null implementation of an [`InputStream`][InputStream] and [`NullOutputStream`][NullOutputStream] as a null implementation of an [`OutputStream`][OutputStream].

```java
// an InputStream that yields no bytes
InputStream in = new NullInputStream();

// an OutputStream that drops all bytes
OutputStream in = new NullOutputStream();
```

### `InputStream` and `OutputStream`

This library provides [`NullReader`][NullReader] as a null implementation of a [`Reader`][Reader] and [`NullWriter`][NullWriter] as a null implementation of a [`Writer`][Writer].

```java
// an InputStream that yields no characters
Reader in = new NullReader();

// an OutputStream that drops all characters
Writer in = new NullWriter();
```

[NullInputStream]: https://markenwerk.github.io/java-commons-nulls/index.html?net/markenwerk/commons/nulls/NullInputStream.html
[NullOutputStream]: https://markenwerk.github.io/java-commons-nulls/index.html?net/markenwerk/commons/nulls/NullOutputStream.html
[NullReader]: https://markenwerk.github.io/java-commons-nulls/index.html?net/markenwerk/commons/nulls/NullReader.html
[NullWriter]: https://markenwerk.github.io/java-commons-nulls/index.html?net/markenwerk/commons/nulls/NullWriter.html

[InputStream]: http://docs.oracle.com/javase/8/docs/api/index.html?java/io/InputStream.html
[OutputStream]: http://docs.oracle.com/javase/8/docs/api/index.html?java/io/OutputStream.html
[Reader]: http://docs.oracle.com/javase/8/docs/api/index.html?java/io/Reader.html
[Writer]: http://docs.oracle.com/javase/8/docs/api/index.html?java/io/Writer.html
