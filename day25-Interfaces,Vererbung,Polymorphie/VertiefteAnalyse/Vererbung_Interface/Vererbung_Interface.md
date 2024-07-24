1. --------------------------
Definition Vererbung:
    - es werden die Eigenschaften(Attribute) und Verhaltensweisen(Methoden) von einer Klasse an eine andere weitergeben
    - ein Kind kann nur 1x erben, von einem Elternelement kann unendlich oft geerbt werden(Ein Elternelement kann unendlich viele Kinder haben)

Definition Interface:
    - könnte als Blaupause/Vorlage beschrieben werden
        - Methoden werden angegeben aber nicht im detail beschrieben, das geschieht in der jeweiligen Klasse
        - dient der Strukurierung des Programms
        - die erstellten Methoden MÜSSEN in der jeweiligen Klasse erstellt werden!

Unterschiede:
    - Vererbt werden können alle Attribute, im Interface können nur Konstanten mitgeben werden!
    - Methoden werden bei der Vererbung ausgeschrieben, beim Interface wird nur der Kopf erstellt
    - Methoden im Interface erstellt MÜSSEN in der implementierten Klasse überschrieben werden
        - Methoden im Elternelement erstellt können aufgerufen werden, auch von allen Kindern, ohne sie jeweils beim Kind anzupassen

Gemeinsamkeiten:
    - Es werden Elemente an andere Klassen übergeben
    - dienen beide die Übersichtlichkeit im Programm zu fördern(wenn richtig angewendet!)
    - müssen beide in der jeweilige Klasse aufgerufen werden (Interface - "implement" / Vererbung - "extends")

Vorteile:
    - födern Übersichtlichkeit
    - geben dem Programm mehr Struktur

Nachteil beide:
    - können bei falscher Anwendung Verwirrung schaffen

Nachteil Interface: 
    - Methoden müssen öfter geschrieben werden
        - Programmierer sind faul
    
2. -------------------------
Anwendung Vererbung:
    - haben Klassen vermehrt die selben Attribute oder Methoden
        - Elternklasse würde alle vereinen

Anwendung Interface:
    - sobald das Programm eine bestimmte größe erreicht hat
        + Methoden sich in der verschiedensten Klassen wiederholen

Reale Beispiele: 
    Vererbung:
        - Autoverkauf: alle Autos haben Räder, Türen, müssen Tanken + weitere Gemeinsamkeiten
            - Elternklasse würde das auffangen und es müsste nicht für jede Autoklasse erneut beschrieben werden!
    
    Interface:
        - Autoverkauf: alle Autos sollen irgendwann verkauft werden, aber wann?, für wieviel? - spezielle Klasse
            - Interface würde einen Plan erstellen, welche Klassen erstellt werden müssen
                - ermittleVerkaufsdatum(), ermittleVerkaufspreis(),   
            - Methode muss in der jeweiligen Klasse implementiert werden!

    Vereinigung:
        - immer!
            - ein Interface zu schreiben ist allerdings ein Mehraufwand, der sich ab einer höheren Klassenanzahl
              erst wirklich lohnt




