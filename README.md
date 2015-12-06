# TrafficSignal-Java-Design-Pattern-Behavioral
Behavioral Design Pattern training exercice

## Preamble

The given source code tree simulate a (GREEN->ORANGE->RED) traffic signal including call button.
States are represented as an enumeration, the traffic signal behavior being implemented in the `TrafficSignal` class.
  
## STATE pattern

Refactor this previous application using the STATE pattern so that the traffic signal behavior gets distributed among individual states.

## OBSERVER pattern

Refactor the previous application (including STATE pattern) using the OBSERVER pattern so that:

- traffic signal updates (color changed or button pressed) are notified to a separate object (instance of `TrafficSignalConsoleDisplay` class)
- button pressed events are simulated by a separate thread and notified to the traffic signal object

*Proper interfaces have to be defined for observers. It may also be considered that each observed object could have more than a single observer.*

Once done, rewrite the application using Observer/Observable interfaces as defined in Java standard library.


