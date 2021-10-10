Things to do
============

Features to be added:
---------------------

- [X] Board drawer
- [X] Spaces/Buyables/Properties
- [X] Rolling dice
- [X] Taxes
- [ ] Chance/Com Chest
- [ ] Property Viewer
- [ ] Houses
- [ ] Trading
- [ ] Jail
- [ ] Save code/file


Issues or smaller things that should be fixed:
----------------------------------------------

- [X] Finish splitting UI into separate class
- [X] Make better property customize code
  - The type, prices, etc. should probably be hardcoded, so only the names would be customizable via `SpaceFiller`
- [X] Change Name customizer to a string array
- [X] Reorganize filesystem
- [ ] Possibly implement dynamic board icons 
  - This means that instead of the board icons being hardcoded, it would be set based on the property names defined in `SpaceFiller`
  - This would be slightly harder because the ~~colors~~ formatting would need to be set as well, so there would have to be an array of the proper ~~colors~~ formatting for the properties
- [ ] Possibly make `Graphics` a subclass of `UI`?