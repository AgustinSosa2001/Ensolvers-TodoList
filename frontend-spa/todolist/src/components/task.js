import React from "react";

export const Task = ({ todo }) => {

  return (
    <div>
      <div id="tasks">
        <div className="task">
          <div className="content">
            <input type="text" className="text" readOnly value={todo.task} />
          </div>

          <div className="actions">
            <button className="edit">Edit</button>

            <button className="delete">Delete</button>
          </div>
        </div>
      </div>
    </div>
  );
};
