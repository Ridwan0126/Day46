import React from "react";
import firebase from "../util/firebase";
import "../App.css";

export default function Todo({ todo }) {
  const deleteTodo = () => {
    const todoRef = firebase.database().ref("parkir").child(todo.id);
    todoRef.remove();
  };
  const completeTodo = () => {
    const todoRef = firebase.database().ref("parkir").child(todo.id);
    todoRef.update({
      complete: !todo.complete,
    });
  };
  return (
    <>
      <br />
      <table className="table-list" border="1" cellPadding="10px">
        <thead class="thead-dark">
          <tr>
            <th>
              Plat
              {/* <br /> */}
              Nomor
            </th>
            <th>Check In</th>
            <th>Check Out</th>
            <th>Tarif</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td className={todo.complete ? "complete" : ""}>
              {todo.platNomor}
            </td>
            <td className={todo.complete ? "complete" : ""}>{todo.In}</td>
            <td className={todo.complete ? "complete" : ""}>{todo.Out}</td>
            <td className={todo.complete ? "complete" : ""}>{todo.title}</td>
            <td>
              <button onClick={deleteTodo}>Delete</button>
              <button onClick={completeTodo}>Complete</button>
            </td>
          </tr>
        </tbody>
      </table>
      {/* <div>
        <h1 className={todo.complete ? "complete" : ""}>{todo.title}</h1>
        <h1 className={todo.complete ? "complete" : ""}>{todo.In}</h1>
        <h1 className={todo.complete ? "complete" : ""}>{todo.Out}</h1>
        <h1 className={todo.complete ? "complete" : ""}>{todo.platNomor}</h1>
        <button onClick={deleteTodo}>Delete</button>
        <button onClick={completeTodo}>Complete</button>
      </div> */}
    </>
  );
}
