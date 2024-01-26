<!DOCTYPE html>
<html>
<head>
</head>
<body>
  <h1>Concurrent Wi-Fi Router Simulator</h1>

  <h2>Table of Contents</h2>
  <ul>
    <li><a href="#problem-definition">Problem Definition</a></li>
    <li><a href="#solution-design">Solution Design</a></li>
    <li><a href="#program-output">Program Output</a></li>
    <li><a href="#sample-input">Sample Input</a></li>
    <li><a href="#sample-output">Sample Output</a></li>
    <li><a href="#usage">Usage</a></li>
  </ul>

  <h2 id="problem-definition">Problem Definition</h2>
  <p>It is required to simulate a limited number of devices connected to a router’s Wi-Fi using Java threading and semaphore. Routers can be designed to limit the number of open connections...</p>

  <h2 id="solution-design">Solution Design</h2>
  <p>Your program must contain the following classes:</p>
  <ol>
    <li><strong>Router Class:</strong> This class contains a list of connections and methods to occupy a connection and release a connection.</li>
    <li><strong>Semaphore Class:</strong> As given in the synchronization lab (Check Lab 3).</li>
    <li><strong>Device Class:</strong> Represent different devices (threads) that can be connected to the router...</li>
  </ol>

  <h2 id="program-output">Program Output</h2>
  <p>You will print the output logs in a file, which simulates the execution order of the devices threads and the printed messages of each device.</p>
  <p>NOTE THAT: This is just an example not the only scenario that can be applied.</p>

  <h2 id="sample-input">Sample Input</h2>
  <pre>
    What is the number of WI-FI Connections?
    2
    What is the number of devices Clients want to connect?
    4
    C1 mobile
    C2 tablet
    C3 pc
    C4 pc
  </pre>

  <h2 id="sample-output">Sample Output</h2>
  <pre>
    - (C1)(mobile)arrived
    - (C2)(tablet)arrived
    - Connection 1: C1 Occupied
    - Connection 2: C2 Occupied
    - C4(pc) arrived and waiting
    - C3(pc)arrived and waiting
    - Connection 1: C1 login
    - Connection 1: C1 performs online activity
    - Connection 2: C2 login
    - Connection 2: C2 performs online activity
    - Connection 1: C1 Logged out
    - Connection 1: C4 Occupied
    - Connection 1: C4 log in
    - Connection 1: C4 performs online activity
    - Connection 2: C2 Logged out
    - Connection 2: C3 Occupied
  </pre>

  <h2 id="usage">Usage</h2>
  <ol>
    <li>Clone the repository.</li>
    <li>Compile the Java files.</li>
    <li>Run the <code>Network</code> class and follow the on-screen instructions.</li>
  </ol>

</body>
</html>
