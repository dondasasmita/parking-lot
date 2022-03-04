import { useState, useEffect } from 'react';

const Clock = () => {
	const currentTime = new Date().toLocaleTimeString();
	const [time, setTime] = useState(currentTime);

	useEffect(() => {
		const updateTime = () => {
			const currentTime = new Date().toLocaleTimeString();
			setTime(currentTime);
		};

		const timer = setTimeout(updateTime, 1000);

		return () => clearInterval(timer);
	});

	return (
		<div>
			<div>Your local time</div>
			<div>
				<h3>{time}</h3>{' '}
			</div>
		</div>
	);
};

export default Clock;
