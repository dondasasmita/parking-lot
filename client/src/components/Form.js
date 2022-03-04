import { useState } from 'react';
import carpark from '../fixture/carpark.json'; // ideally this is live API

const carParkInfo = carpark.items[0].carpark_data;

const Form = () => {
	const initData = {
		carpark_info: [
			{
				total_lots: '',
				lot_type: '',
				lots_available: '',
			},
		],
		carpark_number: '',
		update_datetime: '',
	};
	const [info, setInfo] = useState(initData);

	const clickHandler = e => {
		e.preventDefault();
		// call the api
	};

	return (
		<div>
			<div>
				<h4>Enter an area of your choice</h4>
			</div>
			<div>
				<form onSubmit={clickHandler}>
					<h3>Car Park Number: {info.carpark_number}</h3>
					<h3>Num of Lots Available: {info.carpark_info[0].lots_available}</h3>
					<h3>Lot Type: {info.carpark_info[0].lot_type}</h3>
					<select
						id="carpakNumber"
						onChange={e => {
							const object = JSON.parse(e.target.value);
							setInfo(object);
						}}
						onBlur={() => setInfo(initData)}
					>
						<option value={JSON.stringify(initData)}>Select Your Area</option>
						{carParkInfo.map(parkingLot => (
							<option key={parkingLot.carpark_number} value={JSON.stringify(parkingLot)}>
								{parkingLot.carpark_number}
							</option>
						))}
					</select>
					<div>
						<button>Get Available Lots</button>
					</div>
				</form>
			</div>
		</div>
	);
};

export default Form;
