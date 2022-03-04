import { render } from 'react-dom';
// import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import Form from './components/Form';
import Clock from './components/Clock';
// import ErrorBoundary from './ErrorBoundary';

const App = () => {
	return (
		<div>
			<Form />
			<Clock />
		</div>
	);
};

render(<App />, document.getElementById('root'));
