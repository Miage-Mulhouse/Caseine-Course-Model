/*
 * Creative commons CC BY-NC-SA 2020 Yvan Maillot <yvan.maillot@uha.fr>
 *
 *     Share - You can copy and redistribute the material in any medium or format
 * 
 *     Adapt - You can remix, transform, and build upon the material 
 * 
 * Under the following terms :
 * 
 *     Attribution - You must give appropriate credit, provide a link to the license, 
 *     and indicate if changes were made. You may do so in any reasonable manner, 
 *     but not in any way that suggests the licensor endorses you or your use. 
 * 
 *     NonCommercial — You may not use the material for commercial purposes. 
 * 
 *     ShareAlike — If you remix, transform, or build upon the material, 
 *     you must distribute your contributions under the same license as the original. 
 * 
 * Notices:    You do not have to comply with the license for elements of 
 *             the material in the public domain or where your use is permitted 
 *             by an applicable exception or limitation. 
 * 
 * No warranties are given. The license may not give you all of the permissions 
 * necessary for your intended use. For example, other rights such as publicity, 
 * privacy, or moral rights may limit how you use the material. 
 * 
 * See <https://creativecommons.org/licenses/by-nc-sa/4.0/>.
 */
package geom;

import caseine.tags.*;

// @RelativeEvaluation pour que la somme des points fasse 20

// @ClassTestPriority pour définir l'ordre des tests (cette classe après celle dans PointTest.java)

// @GetterToCheck pour vérifier que x et y ont des getters opérationnels

// @SetterToCheck pour vérifier que x et y ont des setters opérationnels

// @ToDoInConstructor pour retirer à l'étudiant le contenu du constructeur annoté

// @ToDoIn pour retirer à l'étudiant le contenu de la méthode annotée

// @ToCompare pour comparer (strictement) la méthode de l'étudiant avec celle-ci sur quelques instances prises au hasard
// @ToCompare présente de nombreuses limites décrites dans la doc.
//            Ces limites peuvent être outre-passées de différentes manières (décrites dans la doc)
//            Néanmoins, elles fonctionnent bien sur les deux exemples.

// Les annotations sont rarement suffisantes pour faire tous les tests.
// Dans ce cas, il est possible de rajouter vos propres tests unitaires.
// Pour exemple, la vérification du constructeur est ainsi faite dans PointTest.java

// Une classe pour représenter un point du plan cartésien.
@RelativeEvaluation
@ClassTestPriority(2)
public class Point {

    @GetterToCheck(priority = 1, grade = 1)
    @SetterToCheck(priority = 2, grade = 1)
    private double x, y;

    
    @ToDoInConstructor("1.02. Compléter ce constructeur")
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    @ToDoIn("1.03. Compléter ce getter")
    public double getX() {
        return x;
    }

    
    @ToDoIn("1.04. Compléter ce getter")
    public double getY() {
        return y;
    }

    @ToDoIn("1.05. Compléter ce setter")
    public void setX(double x) {
        this.x = x;
    }

    @ToDoIn("1.06. Compléter ce setter")
    public void setY(double y) {
        this.y = y;
    }

    @ToDoIn(value = "1.07. Compléter cette méthode pour qu'elle retourne une chaîne de caractères avec les coordonnées de ce point séparés par une virgule entre parenthèses, e.g. (2.5,3.2)")
    @ToCompare(priority = 3, grade = 2)
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
    @ToDoIn(value = "1.08. Compléter cette méthode pour qu'elle retourne la distance de ce point à l'origine du repère")
    @ToCompare(priority = 4, grade = 2)
    public double distFromO() {
        return Math.sqrt(x*x+y*y);
    }
}