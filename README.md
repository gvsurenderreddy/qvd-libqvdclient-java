libqvdclient-java
=================

Qindel QVD Java Client library

For more information please see http://theqvd.com

Prerequisites
=============

These prerequistes are needed to build this package:

 - libqvdclient-c
 - Maven
 - openjdk

Testing
=======

export QVDTESTHOST=qvddemo.theqvd.com
export QVDTESTUSER=myuser
export QVDTESTPASS=mypass
export ARGS4J=$HOME/.m2/repository/args4j/args4j/2.0.16/args4j-2.0.16.jar

make test

LICENSE
=======
Copyright (C) 2016  theqvd.com trade mark of Qindel Formacion y Servicios, SL 

libqvdclient is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
