import React, { Component } from 'react';
import AppointmentsTable from './AppointmentsTable'

class AppointmentsProvider extends Component {

    state = {
        data: [],
        loaded: false,
        current: 0,
        placeholder: "Loading Appointments..."
    };

    componentDidMount(){
        fetch('/JavaEE_EX-1.0-SNAPSHOT/rest/appointments')
            .then (response => {
                if(response.status !== 200){
                    console.log("Server Error");
                }
                console.log(response);
                return response.json();
            })
            .then (data => {
                console.log(data);
                this.setState({ data: data, loaded: true });
            });



    }

    render(){
        return(

            <div>
                <AppointmentsTable appointments={this.state.data}/>
            </div>
            );
    }

}

export default AppointmentsProvider;