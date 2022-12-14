<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
    <span style="font-weight:bold;"><h2>INFORME DE LABORATORIO</h2></span>
</div>


<table>
<theader>
    <tr><th colspan="6" style="width:50%; height:auto; text-align:center">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
    <tr>
        <td>ASIGNATURA:</td><td colspan="5">Laboratorio de Estructura de Datos y Algoritmos</td>
    </tr>
    <tr>
        <td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Árbol B</td>
    </tr>
    <tr>
        <td>NÚMERO DE PRÁCTICA:</td><td>06</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
    </tr>
    <tr>
        <td colspan="2">FECHA DE PRESENTACIÓN</td><td>07-Ago-2022</td><td colspan="2">HORA DE PRESENTACIÓN: </td><td>11:59 pm</td>
    </tr>
    <tr>
        <td colspan="3">INTEGRANTES:
        <ol>
        <li>Umasi Cariapaza, Carlos Daniel</li>
        </ol>
        </td>
        <td colspan="2"> NOTA:</td>
        <td>     </td>
    </tr>
    <tr>
        <td colspan="6">DOCENTE:<br>
        Mg. Richart Smith Escobedo Quispe
        </td>
    </tr>
</tdbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">SOLUCIÓN Y RESULTADOS</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS
            <p>Para poder probar cada ejercicio se llama a la clase Test de su respectiva carpeta que contiene   el ejemplo de muestra.</p>
            <p>1. Modificar el método de obtención de la clave dada: (5 puntos)</p>
            <p>Para este ejercicio se pide la obtención de los diferentes valores a partir de las claves seleccionadas, para ello se cambió el código que da los valores por el siguiente:<p>
<pre>
if (ht == 0) {
        for (int j = 0; j < x.m; j++) {
             if(eq(key,children[j].key))
                   s.append("\n"+children[j].val);
         }
else {
        for (int j = 0; j < x.m; j++) { 
             s.append(search(children[j].next,key, ht-1));
         }
return s.toString;</pre>
            <p>Básicamente el código revisa todas las hojas y da las direcciones ip de los valores que tengan la clave dada.<br></p>
            <p>2. Mostrar en un diagrama de árbol gráficamente la estructura final para los datos ingresados: (4 puntos)</p>
            <p>Para este ejercicio se hizo un diagrama de la siguiente impresión del código del árbol B:<br>
            Impresión del código:</p>
<pre>
          www.amazon.com 207.171.182.16
          www.apple.com 17.112.152.32
          www.cnn.com 64.236.16.20
     (www.cs.princeton.edu)
          www.cs.princeton.edu 128.112.136.12
          www.cs.princeton.edu 128.112.136.11
          www.dell.com 143.166.224.230
(www.ebay.com)
          www.ebay.com 66.135.192.87
          www.espn.com 199.181.135.201
          www.google.com 216.239.41.99
     (www.microsoft.com)
          www.microsoft.com 207.126.99.140
          www.nytimes.com 199.239.136.200
(www.princeton.edu)
          www.princeton.edu 128.112.128.15
          www.simpsons.com 209.052.165.60
     (www.slashdot.org)
          www.slashdot.org 66.35.250.151
          www.weather.com 63.111.66.11
     (www.yahoo.com)
          www.yahoo.com 216.109.118.65
          www.yale.edu 130.132.143.21</pre>
            <p>Diagrama del árbol B:</p>
            <img src="Ejercicio2/ArbolB.jpg" alt="Arbol b">
            <p>Se omitieron las direcciones ip para que no quedara muy cargado de estas, sin embargo la estructura inicial se mantiene.</p>
            <p>3. Mostrar paso a paso el árbol-B al eliminar " www.espn.com": (4 puntos)</p>
            <p>
            Para este ejercicio se realizará la suposición en la cual se elimine “www.espn.com”<br>
            Primer paso:<br>
            Localizar la hoja donde se encuentra.<br></p>
<pre>
          www.ebay.com 66.135.192.87
          www.espn.com 199.181.135.201
          www.google.com 216.239.41.99
  … (www.microsoft.com)
          www.microsoft.com 207.126.99.140
          www.nytimes.com 199.239.136.200</pre>
            <p>Segundo paso:<br>
            Eliminar la hoja “www.espn.com”.</p>
<pre>
          www.ebay.com 66.135.192.87
          ...
          www.google.com 216.239.41.99
  … (www.microsoft.com)
          www.microsoft.com 207.126.99.140
          www.nytimes.com 199.239.136.200</pre>
            <p>Último paso:<br>
            Verificar que condición de borrado cumple en este caso se cumple la condición de Unión.</p>
<pre>
          www.ebay.com 66.135.192.87
          www.google.com 216.239.41.99
  … (www.microsoft.com)
          www.microsoft.com 207.126.99.140
          www.nytimes.com 199.239.136.200</pre>
<p>Con estos pasos se ha borrado correctamente  “www.espn.com” del árbol-B.<br>
Para la parte de la pregunta se responderá en la sección de cuestionario.
            <p>4. Agregar un nodo adicional (www.youtube.com, 134.24.13.78) y mostrarlo paso a paso. (3 puntos)</p>
            <p>Para este ejercicio se realizará la suposición en la cual se añada “www.youtube.com, 134.24.13.78 ”<br>
            Primer paso:<br>
            Localizar el nodo donde debería ir el nodo.<br></p>  
<pre>
          www.princeton.edu 128.112.128.15
          www.simpsons.com 209.052.165.60
  …(www.slashdot.org)
          www.slashdot.org 66.35.250.151
          www.weather.com 63.111.66.11
  …(www.yahoo.com)
          www.yahoo.com 216.109.118.65
          www.yale.edu 130.132.143.21</pre>
            <p>Segundo paso:<br>
            Insertar la hoja “www.youtube.com, 134.24.13.78”.</p>
<pre>
          www.princeton.edu 128.112.128.15
          www.simpsons.com 209.052.165.60
  …(www.slashdot.org)
          www.slashdot.org 66.35.250.151
          www.weather.com 63.111.66.11
  …(www.yahoo.com)
          www.yahoo.com 216.109.118.65
          www.yale.edu 130.132.143.2
          www.youtube.com, 134.24.13.78</pre>
            <p>Último paso:<br>
            Se verifica si es igual o mayor al orden del árbol-b como no es el caso se inserta y termina la inserción.</p>
<pre>
          www.princeton.edu 128.112.128.15
          www.simpsons.com 209.052.165.60
  …(www.slashdot.org)
          www.slashdot.org 66.35.250.151
          www.weather.com 63.111.66.11
  …(www.yahoo.com)
          www.yahoo.com 216.109.118.65
          www.yale.edu 130.132.143.2
          www.youtube.com, 134.24.13.78</pre>
            </td>
        </tr>
        <tr>
            <td>
            II. CUESTIONARIO<br>
            <ul>
             <li>¿Por qué están entre paréntesis ciertas claves? (4 puntos)</li>
             <p>Las claves que se encuentran entre paréntesis son nodos los cuales contienen a sus respectivas hojas que son las no se encuentran en paréntesis y como se puede observar en el código estas pueden llegar a ser nodos o como (www.princeton.edu) y (www.ebay.com) que son raíz.</p>
             </ul>
            </td>
        </tr>
        <tr>
            <td>
            III. CONCLUSIONES<br>
            <ul>
            <li>Es interesante la funcionalidad del código y como el creador utilizó su ingenio para representar los nodos y las hojas colocando en unos paréntesis y en otros no.</li>
            <li>La forma en cómo se inserta los elementos es otro aspecto muy llamativo pues utiliza las reglas y las añade a su código haciéndolo muy eficaz a la hora de crear un árbol B.</li>
            <li>Además el que cambie de nodo dependiendo qué nodo se añade es otra funcionalidad muy interesante pues recrea muy bien lo que sucede en un árbol B convencional.</li>
            </ul>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">RETROALIMENTACIÓN GENERAL</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">REFERENCIAS Y BIBLIOGRAFÍA<br>
            </th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            <p>Proyectos de tecnología con arduino, 2022. Manejo de ramas de Git, en vs code . (branch). [video] Available at: https://www.youtube.com/watch?v=k8UlMFtNDpE.<br>
            - Weiss M., Data Structures & Algorithm Analysis Using Java, 2010, Addison-Wesley.<br>
            -Capítulo 4. Representación de conjuntos mediante arboles, Departamento de Informática y Sistemas Área de Lenguajes y Sistemas, Universidad de Murcia, pág.168.<br>
            -https://www.cs.usfca.edu/~galles/visualization/BTree.html<br>
            -https://ccia.ugr.es/~jfv/ed1/tedi/cdrom/docs/arb_B.html</p>
            </td>
        </tr>
    </tbody>
</table>