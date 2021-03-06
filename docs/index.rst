.. pytreemap documentation master file, created by
   sphinx-quickstart on Mon Jun 15 21:14:23 2020.
   You can adapt this file completely to your liking, but it should at least
   contain the root `toctree` directive.

pytreemap
=========
|build| |codecov| |pypi_version| |python_version| |license|

.. |build| image:: https://travis-ci.com/GavinPHR/pytreemap.svg?branch=master
.. |codecov| image:: https://codecov.io/gh/GavinPHR/pytreemap/branch/master/graph/badge.svg
.. |pypi_version| image:: https://img.shields.io/pypi/v/pytreemap
.. |python_version| image:: https://img.shields.io/badge/python-%3E%3D3.5-blue
.. |license| image:: https://img.shields.io/github/license/GavinPHR/pytreemap

.. toctree::
   :maxdepth: 1
   :caption: Contents:

   ./installation
   ./demo
   ./tree_map
   ./tree_set
   ./entry
   ./entry_set
   ./values
   ./navigable_set
   ./navigable_map
   ./benchmarks
   ./license

.. module:: pytreemap

:py:mod:`pytreemap` is a Python implementation of Java TreeMap/TreeSet.
Most of the TreeMap/TreeSet APIs are implemented with some exceptions.
Please go to the :doc:`tree_map` section or :doc:`tree_set` section for
the full list of implemented APIs.

The underlying data structure is the Red-Black tree and
offers :math:`O(\text{log}\ n)` time complexity for
search (:meth:`get() <TreeMap.get>`), insert (:meth:`put() <TreeMap.put>`),
delete (:meth:`remove() <TreeMap.remove>`), and many other operations.

Same as Java TreeMap/TreeSet, this implementation is **NOT**
synchronized, you **MUST** do synchronization yourself in
multi-threaded applications.

The iterators returned by the TreeMap/TreeSet are *fail-fast*, meaning that
an exception is thrown **as soon as** a structural change to the TreeMap/TreeSet
is discovered.

.. NOTE::
   You should not rely on the *fail-fast* behaviour while testing
   your programs correctness. There is no guarantee that structural
   changes to the TreeMap/TreeSet are always caught.

Source code is available on `GitHub <https://github.com/GavinPHR/pytreemap>`_.

.. Indices and tables
.. ==================

.. * :ref:`genindex`
.. * :ref:`modindex`
.. * :ref:`search`
