import React from "react";
import PropTypes from "prop-types";

const AppointmentsTable = ({ appointments }) => (

    <div>
        <h2  className="subtitle">
            Appointments
        </h2>
        <table className= "table-position">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Date</th>
            </tr>
            </thead>
            <tbody>
            {appointments.map(appointments => (
                <tr className = "table-row"
                    key={appointments.ID}>
                    <td>{appointments.ID}</td>
                    <td >{appointments.appointName}</td>
                    <td>{appointments.appointDate}</td>
                </tr>
            ))}
            </tbody>
        </table>
    </div>

);

AppointmentsTable.propTypes = {

    appointments: PropTypes.array.isRequired

};


export default AppointmentsTable;

